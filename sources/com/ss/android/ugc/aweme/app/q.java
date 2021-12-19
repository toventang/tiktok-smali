package com.ss.android.ugc.aweme.app;

import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

final /* synthetic */ class q implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private final CommandDispatcher f66863a;

    static {
        Covode.recordClassIndex(41173);
    }

    q(CommandDispatcher commandDispatcher) {
        this.f66863a = commandDispatcher;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        CommandDispatcher commandDispatcher = this.f66863a;
        try {
            if (message.what == 104) {
                try {
                    JSONObject jSONObject = (JSONObject) message.obj;
                    jSONObject.optLong("i");
                    jSONObject.optString("t");
                    List<Object> list = commandDispatcher.f66486d;
                    if (list != null) {
                        Iterator<Object> it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                            jSONObject.optJSONObject("p");
                        }
                    }
                } catch (Exception unused) {
                    Logger.debug();
                }
            }
        } catch (Exception unused2) {
        }
    }
}
