package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter;
import com.ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class DownloadableModelSupportEffectFetcher extends ModelEffectFetcher {
    static {
        Covode.recordClassIndex(95183);
    }

    private String normalizeResourceName(String str) {
        return ModelNameProcessor.getNameOfModel(str);
    }

    /* access modifiers changed from: package-private */
    public Collection<ModelInfo> collectNeedDownloadModelsListNonBlocking(String[] strArr) {
        LoadedModelList requireDecidedConfigNonBlockling = getModelConfigArbiter().requireDecidedConfigNonBlockling(0);
        if (requireDecidedConfigNonBlockling == null) {
            return new ArrayList();
        }
        return getModelFetcher().collectNeedDownloadModelsListInternal(0, strArr, requireDecidedConfigNonBlockling, null);
    }

    @Override // com.ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher
    public String[] peekResourceNameArray(EffectFetcherArguments effectFetcherArguments) {
        if (effectFetcherArguments == null || effectFetcherArguments.getEffect() == null) {
            return null;
        }
        return AlgorithmUtils.getResourceNameArrayOfEffect(effectFetcherArguments.getEffect());
    }

    public List<LocalModelInfo> collectLocalModelInfo(String[] strArr) {
        IModelCache modelCache;
        ArrayList arrayList = new ArrayList();
        if (strArr == null || strArr.length == 0 || (modelCache = getModelCache()) == null) {
            return arrayList;
        }
        for (String str : strArr) {
            LocalModelInfo localModelInfoByName = modelCache.getLocalModelInfoByName(normalizeResourceName(str), null);
            if (localModelInfoByName != null) {
                arrayList.add(localModelInfoByName);
            } else if (modelCache.isBuiltInResource(str)) {
                String versionOfModel = ModelNameProcessor.getVersionOfModel(str);
                int sizeOfModel = ModelNameProcessor.getSizeOfModel(str);
                LocalModelInfo fromFile = LocalModelInfo.fromFile("asset://model/".concat(String.valueOf(str)));
                fromFile.setVersion(versionOfModel);
                fromFile.setSize(sizeOfModel);
                arrayList.add(fromFile);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void fetchModels(List<String> list, Map<String, List<String>> map) {
        Effect effect = new Effect();
        effect.setName("Stub");
        effect.setRequirements(list);
        if (!CollectionUtil.isMapEmpty(map)) {
            effect.setModelNames(new JSONObject(map).toString());
        }
        getModelFetcher().fetchModels(peekResourceNameArray(new EffectFetcherArguments(effect, null, null)));
    }

    public DownloadableModelSupportEffectFetcher(DownloadableModelConfig downloadableModelConfig, IModelCache iModelCache, EffectNetWorkerWrapper effectNetWorkerWrapper, ModelConfigArbiter modelConfigArbiter) {
        super(downloadableModelConfig, modelConfigArbiter, iModelCache, effectNetWorkerWrapper);
    }
}
