package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.annotation.a;
import com.bytedance.android.livesdk.i18n.b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

@a(a = 1)
public class I18nInitTask extends com.bytedance.android.livesdk.y.a {
    static {
        Covode.recordClassIndex(10139);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public String getTaskName() {
        return "i18n_init_task";
    }

    @Override // com.bytedance.android.livesdk.y.a
    public List<Integer> preTasks() {
        return Arrays.asList(4);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public void run() {
        b.a().a(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).currentLocale());
    }
}
