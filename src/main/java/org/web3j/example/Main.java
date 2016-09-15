package org.web3j.example;

import org.web3j.methods.response.Web3ClientVersion;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

/**
 * Web3j example code.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        Web3ClientVersion clientVersion = web3.web3ClientVersion().sendAsync().get();

        System.out.println("Client is running version: " + clientVersion.getWeb3ClientVersion());
    }
}
