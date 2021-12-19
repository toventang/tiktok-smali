package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class SpeedPredictorRecord {
    private String mFileId = "";
    private ArrayList<SpeedPredictorRecordItem> mSpeedRecordItems;

    static {
        Covode.recordClassIndex(28048);
    }

    public String getFileId() {
        return this.mFileId;
    }

    public ArrayList<SpeedPredictorRecordItem> getSpeedRecordItems() {
        return this.mSpeedRecordItems;
    }

    public void setFileId(String str) {
        this.mFileId = str;
    }

    public void setSpeedRecordItems(ArrayList<SpeedPredictorRecordItem> arrayList) {
        this.mSpeedRecordItems = arrayList;
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mFileId = jSONObject.optString("stream_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("downinfo");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.mSpeedRecordItems = new ArrayList<>();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        SpeedPredictorRecordItem speedPredictorRecordItem = new SpeedPredictorRecordItem();
                        speedPredictorRecordItem.extractFields(jSONObject2);
                        this.mSpeedRecordItems.add(speedPredictorRecordItem);
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
        }
    }
}
