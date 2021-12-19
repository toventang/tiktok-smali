package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class SceneDetectInfo {
    int choose;
    SceneDetectItem[] mSceneDetectItems;

    static {
        Covode.recordClassIndex(36910);
    }

    public int getChoose() {
        return this.choose;
    }

    public SceneDetectItem[] getSceneDetectItems() {
        return this.mSceneDetectItems;
    }

    public void setChoose(int i2) {
        this.choose = i2;
    }

    public void setSceneDetectItems(SceneDetectItem[] sceneDetectItemArr) {
        this.mSceneDetectItems = sceneDetectItemArr;
    }
}
