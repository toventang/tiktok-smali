package com.bytedance.lobby.line;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.b;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.a.c;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class LineAuth extends LineProvider<AuthResult> implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f40262b = a.f40144a;

    /* renamed from: d  reason: collision with root package name */
    private LobbyViewModel f40263d;

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        return null;
    }

    static {
        Covode.recordClassIndex(24815);
    }

    /* renamed from: com.bytedance.lobby.line.LineAuth$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40264a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 24816(0x60f0, float:3.4775E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.linecorp.linesdk.b[] r0 = com.linecorp.linesdk.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lobby.line.LineAuth.AnonymousClass1.f40264a = r2
                com.linecorp.linesdk.b r0 = com.linecorp.linesdk.b.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lobby.line.LineAuth.AnonymousClass1.f40264a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.linecorp.linesdk.b r0 = com.linecorp.linesdk.b.CANCEL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.lobby.line.LineAuth.AnonymousClass1.f40264a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.linecorp.linesdk.b r0 = com.linecorp.linesdk.b.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.line.LineAuth.AnonymousClass1.<clinit>():void");
        }
    }

    public LineAuth(com.bytedance.lobby.d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(e eVar, Bundle bundle) {
        b.a(this.f40263d, this.f40228c.f40176b);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, Bundle bundle) {
        this.f40263d = (LobbyViewModel) ae.a(eVar, (ad.b) null).a(LobbyViewModel.class);
        if (!t_()) {
            b.a(this.f40263d, "line", 1);
            return;
        }
        try {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new LineAuthenticationConfig.a(this.f40228c.f40177c), (byte) 0);
            List emptyList = Collections.emptyList();
            if (!lineAuthenticationConfig.f54990e && !c.f54971b) {
                c.f54971b = true;
                l.a a2 = l.a(o.FIXED);
                a2.f79174c = 1;
                ExecutorService a3 = g.a(a2.a());
                Context applicationContext = eVar.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                a3.execute(new c.a(applicationContext));
            }
            Intent intent = new Intent(eVar, LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("permissions", (String[]) emptyList.toArray(new String[emptyList.size()]));
            eVar.startActivityForResult(intent, 1);
        } catch (Throwable th) {
            AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 1);
            aVar.f40157a = false;
            aVar.f40158b = new com.bytedance.lobby.c(6, th.getMessage());
            this.f40263d.b(aVar.a());
        }
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, int i2, int i3, Intent intent) {
        LineLoginResult lineLoginResult;
        if (intent == null) {
            lineLoginResult = new LineLoginResult(com.linecorp.linesdk.b.INTERNAL_ERROR, new LineApiError("Callback intent is null"));
        } else {
            lineLoginResult = (LineLoginResult) intent.getParcelableExtra("authentication_result");
            if (lineLoginResult == null) {
                lineLoginResult = new LineLoginResult(com.linecorp.linesdk.b.INTERNAL_ERROR, new LineApiError("Authentication result is not found."));
            }
        }
        int i4 = AnonymousClass1.f40264a[lineLoginResult.f54997b.ordinal()];
        if (i4 == 1) {
            LineCredential lineCredential = lineLoginResult.f54999d;
            if (lineCredential != null) {
                AuthResult.a aVar = new AuthResult.a("line", 1);
                aVar.f40157a = true;
                aVar.f40163g = lineCredential.f54932a.f54927b;
                aVar.f40161e = lineCredential.f54932a.f54926a;
                this.f40263d.b(aVar.a());
            }
        } else if (i4 != 2) {
            Bundle bundle = new Bundle();
            bundle.putInt("line_response_ordinal", lineLoginResult.f54997b.ordinal());
            AuthResult.a aVar2 = new AuthResult.a("line", 1);
            aVar2.f40157a = false;
            aVar2.f40158b = new com.bytedance.lobby.c(3, lineLoginResult.f55000e.f54931c);
            aVar2.f40165i = bundle;
            this.f40263d.b(aVar2.a());
        } else {
            AuthResult.a aVar3 = new AuthResult.a("line", 1);
            aVar3.f40157a = false;
            aVar3.f40158b = new com.bytedance.lobby.c(4, "Line login cancelled by user");
            this.f40263d.b(aVar3.a());
        }
    }
}
