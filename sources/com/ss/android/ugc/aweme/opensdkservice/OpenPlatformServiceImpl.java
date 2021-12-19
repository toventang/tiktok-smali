package com.ss.android.ugc.aweme.opensdkservice;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.metrics.ai;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;
import com.ss.android.ugc.aweme.requesttask.idle.c;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.t.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;

public final class OpenPlatformServiceImpl implements IOpenPlatformService {
    static {
        Covode.recordClassIndex(73719);
    }

    public static final class a implements b.AbstractC3651b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HandleMediaListener f114524a;

        static {
            Covode.recordClassIndex(73720);
        }

        @Override // com.ss.android.ugc.aweme.t.b.AbstractC3651b
        public final void a() {
            HandleMediaListener handleMediaListener = this.f114524a;
            if (handleMediaListener != null) {
                handleMediaListener.onArgsError();
            }
        }

        a(HandleMediaListener handleMediaListener) {
            this.f114524a = handleMediaListener;
        }

        @Override // com.ss.android.ugc.aweme.t.b.AbstractC3651b
        public final void a(ArrayList<String> arrayList) {
            l.d(arrayList, "");
            HandleMediaListener handleMediaListener = this.f114524a;
            if (handleMediaListener != null) {
                handleMediaListener.onGetVideoPath(arrayList);
            }
        }

        @Override // com.ss.android.ugc.aweme.t.b.AbstractC3651b
        public final void b(ArrayList<String> arrayList) {
            l.d(arrayList, "");
            HandleMediaListener handleMediaListener = this.f114524a;
            if (handleMediaListener != null) {
                handleMediaListener.onGetImagePath(arrayList);
            }
        }
    }

    public static IOpenPlatformService b() {
        Object a2 = com.ss.android.ugc.b.a(IOpenPlatformService.class, false);
        if (a2 != null) {
            return (IOpenPlatformService) a2;
        }
        return new OpenPlatformServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void a() {
        new f.b().b((r) new c()).a();
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final boolean a(Intent intent) {
        l.d(intent, "");
        if (!TextUtils.isEmpty(b.a(intent, "_aweme_open_sdk_params_client_key"))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void a(Intent intent, HandleMediaListener handleMediaListener) {
        l.d(intent, "");
        a aVar = new a(handleMediaListener);
        Bundle a2 = b.a(intent);
        if (a2 != null) {
            ArrayList<String> stringArrayList = a2.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
            ArrayList<String> stringArrayList2 = a2.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
            if (!com.bytedance.common.utility.collection.b.a((Collection) stringArrayList)) {
                aVar.b(stringArrayList);
            } else if (!com.bytedance.common.utility.collection.b.a((Collection) stringArrayList2)) {
                aVar.a(stringArrayList2);
            } else {
                aVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void a(Fragment fragment, ArrayList<String> arrayList) {
        l.d(fragment, "");
        l.d(arrayList, "");
        if (fragment != null && fragment.getContext() != null) {
            Intent intent = new Intent(fragment.getContext(), AwemeAuthorizeLoginActivity.class);
            intent.putStringArrayListExtra("authorize_hide_platforms", arrayList);
            fragment.startActivityForResult(intent, 2001);
        }
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void a(EditConfig.Builder builder, String str) {
        l.d(builder, "");
        l.d(str, "");
        AVChallenge aVChallenge = new AVChallenge();
        ArrayList arrayList = new ArrayList();
        aVChallenge.challengeName = str;
        arrayList.add(aVChallenge);
        builder.challenges(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void a(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        ai aiVar = new ai();
        aiVar.f109486a = str;
        aiVar.f109488c = str2;
        aiVar.f109490e = 1;
        aiVar.p = str3;
        aiVar.f109489d = str4;
        aiVar.f();
    }
}
