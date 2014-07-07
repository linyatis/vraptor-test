package br.com.teste.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.teste.model.Contato;

@Controller
public class IndexController {

	@Inject
	private Result result;

	@Path("/")
	public void index() {
	}

	@Post("/contato/salvar")
	@Consumes("application/json")
	public void salvar(Contato contato) {

		result.use(Results.json()).from(contato).serialize();

	}

}
