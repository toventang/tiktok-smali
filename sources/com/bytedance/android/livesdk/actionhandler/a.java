package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class a implements IActionHandlerService {
    private List<f> schemaHandlers = new ArrayList();
    private r userProfileActionHandler = new r();

    static {
        Covode.recordClassIndex(7549);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    public a() {
        this.schemaHandlers.add(new RoomActionHandler());
        this.schemaHandlers.add(this.userProfileActionHandler);
        this.schemaHandlers.add(new s());
        this.schemaHandlers.add(new h());
        this.schemaHandlers.add(new j());
        this.schemaHandlers.add(new k());
        this.schemaHandlers.add(new d());
        this.schemaHandlers.add(new i());
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean showUserProfile(long j2) {
        return r.a(j2, null, null);
    }

    private f getHandler(Uri uri) {
        for (f fVar : this.schemaHandlers) {
            if (fVar.canHandle(uri)) {
                return fVar;
            }
        }
        return null;
    }

    static final /* synthetic */ void lambda$postReportReason$1$ActionHandlerService(Throwable th) {
        if (th instanceof com.bytedance.android.live.a.a.b.a) {
            ao.a(y.e(), ((com.bytedance.android.live.a.a.b.a) th).getErrorMsg(), 0);
            com.bytedance.android.live.core.c.a.a("ALogger", th);
        }
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean canHandle(Uri uri) {
        for (f fVar : this.schemaHandlers) {
            if (fVar.canHandle(uri)) {
                return true;
            }
        }
        return false;
    }

    static final /* synthetic */ void lambda$postReportReason$0$ActionHandlerService(d dVar) {
        if (dVar != null && dVar.data != null && !TextUtils.isEmpty(((ReportCommitData) dVar.data).desc)) {
            ao.a(y.e(), ((ReportCommitData) dVar.data).desc, 0);
        }
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handle(Context context, Uri uri) {
        return handleSchema(context, uri, true);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handle(Context context, String str) {
        return handleSchema(context, Uri.parse(str), true);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handleWithoutHost(Context context, String str) {
        return handleSchema(context, Uri.parse(str), false);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
        return handleSchema(context, uri, false, map);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean showUserProfile(long j2, String str, Map<String, String> map) {
        return r.a(j2, str, map);
    }

    private boolean handleSchema(Context context, Uri uri, boolean z) {
        if ((TextUtils.equals(uri.getScheme(), "http") || TextUtils.equals(uri.getScheme(), "https")) && z) {
            ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager().a(context, e.b(uri.toString()));
            return true;
        }
        f handler = getHandler(uri);
        if (handler != null) {
            return handler.handle(context, uri);
        }
        if (!z || !((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).handleSchema(context, uri.toString(), new Bundle())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public void postReportReason(long j2, long j3, long j4, String str) {
        ((ActionHandlerApi) com.bytedance.android.live.network.e.a().a(ActionHandlerApi.class)).postReportReasons(j2, j3, j4, str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(b.f13635a, c.f13636a);
    }

    private boolean handleSchema(Context context, Uri uri, boolean z, Map<String, String> map) {
        if ((TextUtils.equals(uri.getScheme(), "http") || TextUtils.equals(uri.getScheme(), "https")) && z) {
            ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager().a(context, e.b(uri.toString()));
            return true;
        }
        f handler = getHandler(uri);
        if (handler != null) {
            return handler.handle(context, uri, map);
        }
        if (!z || !((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).handleSchema(context, uri.toString(), new Bundle())) {
            return false;
        }
        return true;
    }
}
