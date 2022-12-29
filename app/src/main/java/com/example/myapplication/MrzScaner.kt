package com.example.myapplication

import androidx.core.app.ActivityCompat.startActivityForResult
import org.json.JSONObject
/*
import com.getcapacitor.Plugin

public class MrzScannerPlugin extends Plugin {

    @PluginMethod
    public void startScanner(PluginCall call) {
        String label = call . getString ("label");

        try {
            JSONObject options = new JSONObject();
            options.put("mode", "mrz");

            JSONObject config = new JSONObject();
            config.put("label", label);

            options.put("config", config);

            Intent intent = new Intent(this.getContext(), SmartScannerActivity.class);
            ScannerOptions scannerOptions = new Gson().fromJson(
                options.toString(),
                ScannerOptions.class);
            intent.putExtra(SmartScannerActivity.SCANNER_OPTIONS, scannerOptions);

            startActivityForResult(call, intent, "executeScannerResult");
        } catch (JSONException e) {
            e.printStackTrace();
            call.reject(e.getLocalizedMessage());
        }
    }

    @ActivityCallback
    private void executeScannerResult(PluginCall call, ActivityResult result) {
        if (call == null) {
            return;
        }

        int resultCode = result . getResultCode ();
        Intent intent = result . getData ();

        if (intent == null) {
            return;
        }

        try {
            if (resultCode == Activity.RESULT_OK) {
                String returnedResult = intent . getStringExtra (SmartScannerActivity.SCANNER_RESULT);

                try {
                    if (returnedResult != null) {
                        JSONObject returned = new JSONObject(returnedResult);

                        JSObject _result = new JSObject();
                        _result.put("documentNumber", returned.get("documentNumber"));
                        _result.put("personalNumber", returned.get("optional"));

                        JSObject ret = new JSObject();
                        ret.put("result", _result);

                        call.resolve(ret);
                    } else {
                        call.reject("Scanning result is null.");
                    }
                }
            }
        }
    }
}*/
