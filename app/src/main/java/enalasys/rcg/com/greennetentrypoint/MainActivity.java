package enalasys.rcg.com.greennetentrypoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.HashMap;

import Signature.CaptureSignatureView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton closeButton = (ImageButton) findViewById(R.id.submitButton);
        closeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                asXML();
                finish();
            }
        });
    }

    /**
     *
     <Application>
         <application_id>1</application_id>
         <appl_mailing_address>main street</appl_mailing_address>
         <property_address>main street</property_address>
         <owner_name>Eric</owner_name>
         <owner_telephone>555-1212</owner_telephone>
         <professional_in_charge>Eric</professional_in_charge>
         <professional_mailing_address>main street</professional_mailing_address>
         <licence_class>1</licence_class>
         <license_number>1234567890</license_number>
         <license_date>6/9/2017</license_date>
         <contractor_signature>me</contractor_signature>
         <application_date>6/9/2017</application_date>
         <owner_signature>me</owner_signature>
         <wrk_comp_policy>123123123123</wrk_comp_policy>
         <wrk_comp_exp_date>1/1/2018</wrk_comp_exp_date>
         <wrk_comp_agent>maike</wrk_comp_agent>
         <wrk_comp_agent_phone>555-1212</wrk_comp_agent_phone>
         <wrk_comp_signature>me</wrk_comp_signature>
         <wrk_comp_date>6/9/2017</wrk_comp_date>
         <lender_name>Wells Fargo</lender_name>
         <lender_address>main street</lender_address>
         <lender_signature>me</lender_signature>
         <lender_date>6/9/2017</lender_date>
         <wrk_auth_wrk_desc>desc</wrk_auth_wrk_desc>
         <wrk_auth_address>address</wrk_auth_address>
         <wrk_auth_agent_name>agent</wrk_auth_agent_name>
         <wrk_auth_agent_address>address</wrk_auth_agent_address>
         <wrk_auth_agent_phone>phone</wrk_auth_agent_phone>
         <wrk_auth_owner_signature>sign</wrk_auth_owner_signature>
     </Application>
     */

    private static HashMap<String, String> dataTags;

    private static String[] dataTags2 = {
        "appl_mailing_address",
        "property_address",
        "owner_name",
        "owner_telephone",
        "professional_in_charge",
        "professional_mailing_address",
        "licence_class",
        "license_number",
        "license_date",
        "contractor_signature",
        "application_date",
        "owner_signature",
        "wrk_comp_policy",
        "wrk_comp_exp_date",
        "wrk_comp_agent",
        "wrk_comp_agent_phone",
        "wrk_comp_signature",
        "wrk_comp_date",
        "lender_name",
        "lender_address",
        "lender_signature",
        "lender_date",
        "wrk_auth_wrk_desc",
        "wrk_auth_address",
        "wrk_auth_agent_name",
        "wrk_auth_agent_address",
        "wrk_auth_agent_phone",
        "wrk_auth_owner_signature"
    };
    
    private void asXML() {
        HashMap<String, Integer> dataTags = new HashMap<String, Integer>();
        dataTags.put("appl_mailing_address", R.id.applicant_address);
        dataTags.put("property_address", R.id.property_address);
        dataTags.put("owner_name", R.id.owner_name);
        dataTags.put("owner_telephone", R.id.owner_phone);
        dataTags.put("professional_in_charge", R.id.licensed_professional);
        dataTags.put("professional_mailing_address", R.id.contractor_address);
        dataTags.put("licence_class", R.id.license_class);
        dataTags.put("license_number", R.id.license_number);
        dataTags.put("license_date", R.id.contractor_signature_date);
        dataTags.put("lender_name", R.id.owner_name);
        //dataTags.put("lender_address", R.id.add);
        dataTags.put("lender_signature", R.id.builder_signature
        dataTags.put("lender_date", R.id.builder_signature_date
        //dataTags.put("wrk_auth_wrk_desc", "appl_mailing_address");
        dataTags.put("wrk_auth_address", R.id.property_address);
        dataTags.put("wrk_auth_agent_name", R.id.agent_name);
        dataTags.put("wrk_auth_agent_address", R.id.contractor_address);
        dataTags.put("wrk_auth_agent_phone", R.id.agent_phone);
        dataTags.put("wrk_auth_owner_signature", R.id.builder_signature);



        for (String tag: dataTags) {
            String s = "<" + tag + ">" + "value" + "</" + tag + ">";
            String s2 = s;

            R.id.agent_name
        }
    }
}
