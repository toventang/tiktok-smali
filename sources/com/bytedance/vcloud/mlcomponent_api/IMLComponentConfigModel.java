package com.bytedance.vcloud.mlcomponent_api;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IMLComponentConfigModel {
    static {
        Covode.recordClassIndex(28022);
    }

    boolean getEnable();

    Map getExtraFeatureMap();

    String getModelSaveDirName();

    String getModelSaveDirParentPath();

    String getModelUrl();

    String getUseMLEngineName();
}
