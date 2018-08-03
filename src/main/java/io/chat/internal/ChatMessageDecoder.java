package io.ubona.udial.chat.internal;


import io.ubona.udial.chat.model.ChatMessage;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;


public class ChatMessageDecoder implements Decoder.Text<ChatMessage>{

    @Override
    public ChatMessage decode(String text) throws DecodeException {
        return new ChatMessage(text);
    }

    @Override
    public boolean willDecode(String string) {
        return true;
    }

    @Override
    public void init(EndpointConfig ec) {
        //no-op
    }

    @Override
    public void destroy() {
        //no-op
    }
    
}
