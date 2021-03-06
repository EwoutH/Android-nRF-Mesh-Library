package no.nordicsemi.android.meshprovisioner.transport;

import android.support.annotation.NonNull;

import no.nordicsemi.android.meshprovisioner.opcodes.ProxyConfigMessageOpCodes;

import static no.nordicsemi.android.meshprovisioner.transport.ConfigStatusMessage.StatusCodeNames.fromStatusCode;

/**
 * Abstract wrapper class for mesh message.
 */
public abstract class ProxyConfigStatusMessage extends MeshMessage {

    ProxyConfigStatusMessage(@NonNull final ControlMessage message) {
        mMessage = message;
    }

    /**
     * Parses the status parameters returned by a status message
     */
    abstract void parseStatusParameters();

    @Override
    int getAid() {
        return -1;
    }

    @Override
    int getAkf() {
        return -1;
    }

}
