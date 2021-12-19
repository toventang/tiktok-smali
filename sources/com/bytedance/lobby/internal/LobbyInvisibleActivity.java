package com.bytedance.lobby.internal;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.c;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;

public class LobbyInvisibleActivity extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f40230a = a.f40144a;

    /* renamed from: b  reason: collision with root package name */
    public int f40231b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40232c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f40233d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.lobby.auth.d f40234e;

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(24798);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.bytedance.lobby.auth.d dVar = this.f40234e;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
        if (!this.f40232c || this.f40233d) {
            this.f40232c = true;
        } else {
            finish();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bj);
        Intent intent = getIntent();
        final String a2 = a(intent, "provider_id");
        this.f40231b = intent.getIntExtra("action_type", 0);
        com.bytedance.lobby.auth.d b2 = d.a().b(a2);
        this.f40234e = b2;
        if (b2 == null) {
            a a3 = a.a();
            int i2 = this.f40231b;
            AuthResult.a aVar = new AuthResult.a(a2, this.f40231b);
            aVar.f40157a = false;
            aVar.f40158b = new c(1, "No provider found for ".concat(String.valueOf(a2)), "before_goto_URL");
            a3.a(a2, i2, aVar.a());
            finish();
            return;
        }
        LobbyViewModel.a(this).g().observe(this, new u<AuthResult>() {
            /* class com.bytedance.lobby.internal.LobbyInvisibleActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24799);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(AuthResult authResult) {
                a.a().a(a2, LobbyInvisibleActivity.this.f40231b, authResult);
                LobbyInvisibleActivity.this.finish();
            }
        });
        this.f40233d = true;
        int i3 = this.f40231b;
        if (i3 == 1) {
            this.f40234e.a(this, a(intent));
        } else if (i3 != 2) {
            a a4 = a.a();
            int i4 = this.f40231b;
            AuthResult.a aVar2 = new AuthResult.a(a2, this.f40231b);
            aVar2.f40157a = false;
            aVar2.f40158b = new c(1, "Unknown action type: " + this.f40231b);
            a4.a(a2, i4, aVar2.a());
            finish();
        } else {
            this.f40234e.b(this, a(intent));
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.bytedance.lobby.auth.d dVar = this.f40234e;
        if (dVar != null) {
            dVar.a(this, i2, i3, intent);
        }
    }
}
