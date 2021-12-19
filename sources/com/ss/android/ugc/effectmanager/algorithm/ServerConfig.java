package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.LoadedModelList;
import com.ss.android.ugc.effectmanager.common.Multimap;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.HashMap;

public class ServerConfig {
    private Multimap<String, ModelInfo> data;
    private LoadedModelList loadedModelList;

    static {
        Covode.recordClassIndex(95232);
    }

    private void checkContent() {
        HashMap hashMap = new HashMap();
        for (ModelInfo modelInfo : this.data.values()) {
            String name = modelInfo.getName();
            if (!hashMap.containsKey(name)) {
                hashMap.put(name, modelInfo.getVersion());
            } else if (!((String) hashMap.get(name)).equals(modelInfo.getVersion())) {
                throw new RuntimeException("model " + name + " has different versions in ServerTable,Please modify the file to the correct format ");
            }
        }
    }

    public LoadedModelList getLoadedModelList() {
        if (this.loadedModelList == null) {
            checkContent();
            this.loadedModelList = new LoadedModelList();
            Multimap<String, LoadedModelList.ModelInfoState> multimap = new Multimap<>();
            for (String str : this.data.keySet()) {
                for (ModelInfo modelInfo : this.data.get(str)) {
                    multimap.put(str, new LoadedModelList.ModelInfoState(modelInfo));
                }
            }
            this.loadedModelList.setRequirementModelInfoStateMap(multimap);
        }
        return this.loadedModelList;
    }

    public ServerConfig(Multimap<String, ModelInfo> multimap) {
        this.data = (Multimap) Preconditions.checkNotNull(multimap);
    }
}
