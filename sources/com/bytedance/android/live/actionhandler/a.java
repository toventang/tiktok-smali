package com.bytedance.android.live.actionhandler;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public class a implements IActionHandlerService {
    static {
        Covode.recordClassIndex(3520);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean canHandle(Uri uri) {
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handle(Context context, Uri uri) {
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handle(Context context, String str) {
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
        l.d(context, "");
        l.d(uri, "");
        l.d(map, "");
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handleWithoutHost(Context context, String str) {
        return false;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public void postReportReason(long j2, long j3, long j4, String str) {
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean showUserProfile(long j2) {
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean showUserProfile(long j2, String str, Map<String, String> map) {
        return false;
    }
}
