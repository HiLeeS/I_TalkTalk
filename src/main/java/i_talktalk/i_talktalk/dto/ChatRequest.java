package i_talktalk.i_talktalk.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ChatRequest {

    private String model;
    private List<Message> messages;
//    private int n=1;
//    private double temperature;

    public ChatRequest(String model) {
        this.model = model;

        this.messages = new ArrayList<>();
    }

    // getters and setters
}