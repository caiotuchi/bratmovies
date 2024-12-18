package com.caiotuchi.bratmovies;

import com.caiotuchi.bratmovies.model.Filme;
import com.caiotuchi.bratmovies.service.FilmeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
public class BratmoviesApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private FilmeService filmeService;

	@Test
	public void adicionarFilme() throws Exception {
		Filme novoFilme = new Filme("Vortex", "Gaspar Noe", 2021);

		when(filmeService.salvarFilme(novoFilme)).thenReturn(novoFilme);

		mockMvc.perform(post("/filmes")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"titulo\": \"Vortex\", \"diretor\": \"Gaspar Noe\", \"ano\": 2021}"))
				.andExpect(status().isOk());
	}

	@Test
	public void removerFilmeExistente() throws Exception {
		
		String id = "648b4a2d67f3b1e840d5c3a2";
		when(filmeService.removerFilmePorId(id)).thenReturn(true);

		mockMvc.perform(delete("/filmes/{id}", id))
				.andExpect(status().isNoContent());
	}

	@Test
	public void removerFilmeInexistente() throws Exception {
		
		String id = "648b4a2d67f3b1e840d5c3a2";
		when(filmeService.removerFilmePorId(id)).thenReturn(false);

		mockMvc.perform(delete("/filmes/{id}", id))
				.andExpect(status().isNotFound()); 
	}

}
