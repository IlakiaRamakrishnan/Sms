package org.rajalakshmi.sms_proj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber : EditText=findViewById(R.id.id1)
        val etMessage : EditText=findViewById(R.id.id2)
        val btsend : Button=findViewById(R.id.btn)

        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS),10)
        btsend.setOnClickListener {
            val number = etNumber.text.toString()
            val message = etMessage.text.toString()
            val smsManager : SmsManager
            smsManager = SmsManager.getDefault()
            smsManager.sendTextMessage(number,null,message,null,null)
        }
    }
}