package Controle;

import Entidade.Sensor;
import com.pubnub.api.*;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Configurador {

    final String PubKey = "pub-c-3701cc0b-3e9b-4f08-aad4-fb2c0a7de660";
    final String SubKey = "sub-c-bdb4e6fa-a701-11e8-b082-12b6fee23487";
    final String kChannel = "Teste";
    String UserId = null;
    UUID uuid = UUID.randomUUID();
    String aux = uuid.toString();
    PubNub pubnub;

    public Configurador() {

        PNConfiguration pnConfiguration = new PNConfiguration();
        pnConfiguration.setPublishKey(PubKey);
        pnConfiguration.setSubscribeKey(SubKey);
        //Criptografia de UserID
        UserId = "PubNubID" + createUserID(aux);
        pnConfiguration.setUuid(UserId);
        pubnub = new PubNub(pnConfiguration);
    }

    public void publish(Map sensor) {
        try {
            pubnub.publish().channel(kChannel).meta(sensor).message(sensor).async(new PNCallback<PNPublishResult>() {
                @Override
                public void onResponse(PNPublishResult result, PNStatus status) {
                    // handle publish response
                }
            });
            pubnub.subscribe()
                    .channels(Arrays.asList(kChannel)) // subscribe to channels
                    .withPresence() // also subscribe to related presence information
                    .execute();
        } catch (Exception e) {
            System.out.println("Erro na Configuração");
            e.printStackTrace();
        }
    }

    public int createUserID(String aux) {
        int hash = 7;
        for (int i = 0; i < aux.length(); i++) {
            hash = hash * 31 + aux.charAt(i);
        }
        return hash;
    }

}
