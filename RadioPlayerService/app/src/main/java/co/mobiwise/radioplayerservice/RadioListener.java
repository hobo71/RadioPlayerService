package co.mobiwise.radioplayerservice;

import java.util.ArrayList;

/**
 * Created by mertsimsek on 01/07/15.
 */
public interface RadioListener {

    void onRadioStarted();

    void onRadioStopped();

    void onMetaDataReceived(String s, String s2);
}
