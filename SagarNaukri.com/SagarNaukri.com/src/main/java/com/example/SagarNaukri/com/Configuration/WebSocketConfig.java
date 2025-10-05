package SagarNaukriMerge.SagarNaukriMerge.Configuration; // Or your config package

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Messages will be routed to clients on topics starting with "/topic"
        registry.enableSimpleBroker("/topic");
        // Messages from clients will be sent to destinations prefixed with "/app"
        registry.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // The endpoint clients will connect to. SockJS is a fallback.
        registry.addEndpoint("/ws").withSockJS();
    }
}