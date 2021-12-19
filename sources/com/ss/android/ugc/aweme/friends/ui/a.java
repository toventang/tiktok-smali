package com.ss.android.ugc.aweme.friends.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.friends.c.e;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class a extends com.bytedance.ies.foundation.activity.a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private int f97138a;

    /* renamed from: b  reason: collision with root package name */
    private String f97139b;

    static {
        Covode.recordClassIndex(61719);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(397, new g(a.class, "onEvent", e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.n, R.anim.ah);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        com.ss.android.ugc.aweme.common.f.e.a(this, findViewById(R.id.ad7));
        setResult(0);
        super.onBackPressed();
    }

    @r
    public void onEvent(e eVar) {
        if (eVar != null) {
            Intent intent = new Intent();
            intent.putExtra("extra_data", eVar.f96831a);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        x xVar = new x((byte) 0);
        xVar.f65559e = R.attr.f159902m;
        xVar.f65560f = R.attr.f159902m;
        xVar.f65562h = true;
        activityConfiguration(new b(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.b8);
        overridePendingTransition(R.anim.af, R.anim.n);
        findViewById(R.id.ad7).setBackgroundColor(b.c(this, R.color.o5));
        this.f97139b = a(getIntent(), "video_id");
        this.f97138a = getIntent().getIntExtra("source", 0);
        n a2 = getSupportFragmentManager().a();
        String str = this.f97139b;
        int i2 = this.f97138a;
        Bundle bundle2 = new Bundle();
        bundle2.putString("video_id", str);
        bundle2.putInt("source", i2);
        e eVar = new e();
        eVar.setArguments(bundle2);
        eVar.setUserVisibleHint(true);
        a2.b(R.id.ad7, eVar);
        a2.b();
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Fragment fragment, String str, int i2) {
        Intent intent = new Intent(fragment.getActivity(), SummonFriendActivity.class);
        intent.putExtra("video_id", str);
        intent.putExtra("source", i2);
        fragment.startActivityForResult(intent, 3);
    }
}
