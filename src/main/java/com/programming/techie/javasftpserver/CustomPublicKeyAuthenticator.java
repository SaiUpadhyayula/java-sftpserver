package com.programming.techie.javasftpserver;

import org.apache.sshd.server.auth.pubkey.PublickeyAuthenticator;
import org.apache.sshd.server.session.ServerSession;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
public class CustomPublicKeyAuthenticator implements PublickeyAuthenticator {

    @Override
    public boolean authenticate(String username, PublicKey key, ServerSession session) {
        return false;
    }
}
