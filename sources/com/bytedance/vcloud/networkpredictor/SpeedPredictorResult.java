package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class SpeedPredictorResult {
    private String fileId;
    private ArrayList<SpeedPredictorResultItem> resultItems = new ArrayList<>();

    static {
        Covode.recordClassIndex(28051);
    }

    public String getFileId() {
        return this.fileId;
    }

    public ArrayList<SpeedPredictorResultItem> getResultItems() {
        return this.resultItems;
    }

    public int size() {
        return this.resultItems.size();
    }

    public JSONObject toJsonObject() {
        JSONObject jsonObject;
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.fileId;
            if (str != null) {
                jSONObject.put("fileid", str);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<SpeedPredictorResultItem> it = this.resultItems.iterator();
            while (it.hasNext()) {
                SpeedPredictorResultItem next = it.next();
                if (!(next == null || (jsonObject = next.toJsonObject()) == null)) {
                    jSONArray.put(jsonObject);
                }
            }
            if (jSONArray.length() <= 0) {
                return null;
            }
            jSONObject.put("predictInfo", jSONArray);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public void setResultItems(ArrayList<SpeedPredictorResultItem> arrayList) {
        this.resultItems = arrayList;
    }

    public void add(SpeedPredictorResultItem speedPredictorResultItem) {
        this.resultItems.add(speedPredictorResultItem);
    }

    public SpeedPredictorResultItem get(int i2) {
        return this.resultItems.get(i2);
    }
}
