package com.piotrekwitkowski.nfc.desfire.applications;

import com.piotrekwitkowski.nfc.desfire.aids.AIDWrongLengthException;
import com.piotrekwitkowski.nfc.desfire.aids.LibraryAID;
import com.piotrekwitkowski.nfc.desfire.keys.LibraryAESKey0;

public class LibraryApplication extends Application {
    public LibraryApplication() throws AIDWrongLengthException {
        super(new LibraryAID(), new LibraryAESKey0());
    }
}
