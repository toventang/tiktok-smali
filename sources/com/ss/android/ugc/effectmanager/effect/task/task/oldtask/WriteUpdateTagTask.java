package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.task.result.WriteTagTaskResult;
import java.util.HashMap;

public class WriteUpdateTagTask extends NormalTask {
    private ICache mCache;
    private IJsonConverter mJsonConverter;
    private HashMap<String, String> mTagsCachedMap = new HashMap<>();
    private String mTaskId;

    static {
        Covode.recordClassIndex(95539);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        try {
            this.mCache.save("updatetime", this.mJsonConverter.convertObjToJson(this.mTagsCachedMap));
            sendMessage(51, new WriteTagTaskResult(this.mTaskId, null));
        } catch (Exception e2) {
            EPLog.e("NewWriteUpdateTagTask", Log.getStackTraceString(e2));
        }
    }

    public WriteUpdateTagTask(Handler handler, EffectContext effectContext, String str, HashMap<String, String> hashMap) {
        super(handler, str);
        this.mCache = effectContext.getEffectConfiguration().getCache();
        this.mJsonConverter = effectContext.getEffectConfiguration().getJsonConverter();
        this.mTagsCachedMap.putAll(hashMap);
        this.mTaskId = str;
    }
}
