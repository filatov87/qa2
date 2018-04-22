package cucumberStepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

public class TicketChecker {

    private String URL = "http://www.qaguru.lv/tickets/getreservations.php";
    public List getTickets() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(URL, String.class);
        String responseToParse = responseEntity.getBody();

        ObjectMapper mapperTickets = new ObjectMapper();
        return mapperTickets.readValue(responseToParse, List.class);
    }
}
