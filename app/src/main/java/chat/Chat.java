package chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.izabelsilva.ifpbgroupchat.R;

public class Chat extends AppCompatActivity implements View.OnClickListener {

    EditText messageInput;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        // get our input field by its ID
        messageInput = (EditText) findViewById(R.id.message_input);

        // get our button by its ID
        sendButton = (Button) findViewById(R.id.send_button);

        // set its click listener
        sendButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        postMessage();
    }

    private void postMessage()  {
//        String text = //messageInput.getText().toString();
//
//        // return if the text is blank
//        if (text.equals("")) {
//            return;
//        }
//
//
//        RequestParams params = new RequestParams();
//
//        // set our JSON object
//        params.put("text", text);
//        params.put("name", username);
    }
}

