Vagrant.configure("2") do |config|
    config.vm.box = "ubuntu/jammy64"
    config.vm.box_check_update = false
  
    #VM1
    config.vm.define :vm1 do |vm1|
      vm1.vm.network :private_network, ip: "192.168.56.10"
      vm1.vm.provider "virtualbox" do |vb|
        vb.gui = false
        vb.memory = "1024" # Memória definida
      end
    end
  
    #VM2
    config.vm.define :vm2 do |vm2|
      vm2.vm.network :private_network, ip: "192.168.56.11"
      vm2.vm.provider "virtualbox" do |vb|
        vb.gui = false
        vb.memory = "2048"
      end
  
      vm2.vm.synced_folder ".", "/vagrant_data"
      vm2.vm.provision "shell", inline: <<-SHELL
        sudo apt-get update -y
        sudo apt-get install openjdk-17-jdk -y
        sudo apt-get install maven -y
        sudo apt-get install -y gnupg
        wget -qO - https://www.mongodb.org/static/pgp/server-6.0.asc | sudo apt-key add -
        echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu focal/mongodb-org/6.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-6.0.list
        sudo apt-get update -y
        sudo apt-get install -y mongodb-org
        sudo systemctl start mongod
        sudo systemctl enable mongod
        sudo systemctl status mongod || exit 1
        cd /vagrant_data
        mvn clean package
        java -jar target/*.jar &
      SHELL
    end
  end
  