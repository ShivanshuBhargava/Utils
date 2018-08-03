package io.ubona.udial.chat.internal;


import io.ubona.udial.chat.model.WelcomeMessage;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;


public class WelcomeMessageEncoder implements Encoder.Text<WelcomeMessage> {

    @Override
    public String encode(WelcomeMessage welcome) throws EncodeException {
        return welcome.getWelcomeMessage();
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
