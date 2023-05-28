package edu.fateczs.cep_nota_consulta.service;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class ApiService {
    private WebClient webClient;

    public ApiService() {
        this.webClient = WebClient.create();
    }

    /**
     * Sends a HTTP GET request to viacep.com.br to retrieve the address information
     * for the provided CEP (Postal Code).
     *
     * @param  cep  the CEP (Postal Code) to retrieve address information for
     * @return      a JSON string containing the address information for the provided CEP
     */
    public String fazerRequisicaoCEP(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        return webClient.get().uri(url).retrieve().bodyToMono(String.class).block();
    }
}
