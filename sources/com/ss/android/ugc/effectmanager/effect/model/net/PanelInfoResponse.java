package com.ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

public class PanelInfoResponse extends BaseNetResponse {
    private PanelInfoModel data;

    static {
        Covode.recordClassIndex(95432);
    }

    public PanelInfoModel getData() {
        return this.data;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public String getRecId() {
        PanelInfoModel panelInfoModel = this.data;
        if (panelInfoModel == null) {
            return null;
        }
        return panelInfoModel.getRecID();
    }

    public void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }
}
