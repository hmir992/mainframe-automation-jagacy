package com.example.screens;

import com.example.fields.EntryField;
import com.example.session.Session;
import com.example.fields.LabelField;
import com.jagacy.Key;
import com.jagacy.util.JagacyException;

/**
 * Created by upgundecha on 14/10/16.
 */
public class HomeScreen {

    private Session session;
    private String screenCrc = "0xb0c10358";

    // Screen fields
    private LabelField waitForLabel =
            new LabelField(17, 6, "TEXAS A & M UNIVERSITY");
    private EntryField applicationEntryField = new EntryField(23, 1);

    public HomeScreen(final Session s) throws JagacyException, InterruptedException {
        
    	Thread.sleep(3000);
    	this.session = s;
        if (!session.waitForTextLabel(waitForLabel)) {
        	//Thread.sleep(100000);
            //throw new IllegalStateException("Not Home screen!");
        }
        Thread.sleep(3000);
        if (session.getCrc32() != Long.decode(screenCrc)) {
        	//Thread.sleep(100000);
            //throw new IllegalStateException("Home Screen has been changed!");
        }
    }

    /**
     * Open Phonbook Menu screen.
     * @return Phonbook Menu Screen
     * @throws JagacyException JagacyException
     * @throws InterruptedException 
     */
    public final PhonbookMenuScreen openPhonbook() throws JagacyException, InterruptedException {
        
    	Thread.sleep(2000);
    	session.setEntryFieldValue(applicationEntryField, "PHONBOOK");
    	Thread.sleep(1000);
        session.writeKey(Key.ENTER);
        //Thread.sleep(10000);
        session.waitForChange(session.DEFAULT_TIMEOUT);
        //Thread.sleep(10000);
        return new PhonbookMenuScreen(session);
    }
}
