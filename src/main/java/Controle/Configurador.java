package Controle;

import com.pubnub.api.*;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;

public class Configurador {
    final String PubKey = "pub-c-3701cc0b-3e9b-4f08-aad4-fb2c0a7de660";
    final String SubKey = "sub-c-bdb4e6fa-a701-11e8-b082-12b6fee23487";
    final String kChannel = "Teste";
    PubNub pubnub;
    
    public Configurador(){

        PNConfiguration pnConfiguration = new PNConfiguration();
        pnConfiguration.setPublishKey(PubKey);
        pnConfiguration.setSubscribeKey(SubKey);
        pubnub= new PubNub(pnConfiguration);}
    
        public void publish(String data) {
                try {
			pubnub.publish().channel(kChannel).message(data).async(new PNCallback<PNPublishResult>() {
                @Override
                public void onResponse(PNPublishResult result, PNStatus status) {
                    // handle publish response
                }
                });
		} catch (Exception e) {
			System.out.println("Error in configuration");
			e.printStackTrace();
		}
	}
}         