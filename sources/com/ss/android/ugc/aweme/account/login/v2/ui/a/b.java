package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.l.e;
import com.ss.android.ugc.aweme.account.l.h;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.a.z;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.v2.ui.c;
import com.ss.android.ugc.aweme.account.login.v2.ui.p;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import f.a.n;
import f.a.q;
import h.f.b.l;
import java.util.HashMap;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final C1445b f64793a = new C1445b(this);

    /* renamed from: b  reason: collision with root package name */
    private HashMap f64794b;

    static {
        Covode.recordClassIndex(39822);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64794b == null) {
            this.f64794b = new HashMap();
        }
        View view = (View) this.f64794b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64794b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.g5;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64794b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void u() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.a5l)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.a5l)).a(true);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        KeyboardUtils.c(((InputWithIndicator) c(R.id.a5m)).getEditText());
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        c.a(((InputWithIndicator) c(R.id.a5m)).getEditText());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(" ", null, true, getString(R.string.d7b), getString(R.string.d7m), true, null, false, false, 1354);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.b$b  reason: collision with other inner class name */
    public static final class C1445b implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f64796a;

        static {
            Covode.recordClassIndex(39824);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1445b(b bVar) {
            this.f64796a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.account.login.v2.ui.p
        public final void a(int i2, Editable editable) {
            InputResultIndicator inputResultIndicator;
            String text;
            String text2;
            String text3;
            int i3;
            String str;
            String str2;
            if (this.f64796a.ab_()) {
                if (i2 == R.id.axw) {
                    if (editable != null) {
                        i3 = editable.length();
                    } else {
                        i3 = 0;
                    }
                    if (i3 < 8) {
                        LoadingButton loadingButton = (LoadingButton) this.f64796a.c(R.id.a5l);
                        if (loadingButton != null) {
                            loadingButton.setEnabled(false);
                        }
                    } else if (i3 > 20) {
                        b bVar = this.f64796a;
                        String string = bVar.getString(R.string.d_7);
                        l.b(string, "");
                        bVar.a(0, string);
                        LoadingButton loadingButton2 = (LoadingButton) this.f64796a.c(R.id.a5l);
                        if (loadingButton2 != null) {
                            loadingButton2.setEnabled(false);
                        }
                    } else {
                        e eVar = new e();
                        if (editable == null || (str = editable.toString()) == null) {
                            str = "";
                        }
                        if (!eVar.a(str)) {
                            b bVar2 = this.f64796a;
                            String string2 = bVar2.getString(R.string.awl);
                            l.b(string2, "");
                            bVar2.a(0, string2);
                            LoadingButton loadingButton3 = (LoadingButton) this.f64796a.c(R.id.a5l);
                            if (loadingButton3 != null) {
                                loadingButton3.setEnabled(false);
                            }
                        } else {
                            h hVar = new h();
                            if (editable == null || (str2 = editable.toString()) == null) {
                                str2 = "";
                            }
                            if (!hVar.a(str2)) {
                                b bVar3 = this.f64796a;
                                String string3 = bVar3.getString(R.string.awn);
                                l.b(string3, "");
                                bVar3.a(0, string3);
                                LoadingButton loadingButton4 = (LoadingButton) this.f64796a.c(R.id.a5l);
                                if (loadingButton4 != null) {
                                    loadingButton4.setEnabled(false);
                                }
                            } else {
                                LoadingButton loadingButton5 = (LoadingButton) this.f64796a.c(R.id.a5l);
                                if (loadingButton5 != null) {
                                    loadingButton5.setEnabled(true);
                                }
                                InputResultIndicator inputResultIndicator2 = (InputResultIndicator) this.f64796a.c(R.id.a5j);
                                if (inputResultIndicator2 != null) {
                                    inputResultIndicator2.a();
                                }
                            }
                        }
                    }
                }
                InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f64796a.c(R.id.a5m);
                if (inputWithIndicator == null || (text3 = inputWithIndicator.getText()) == null || text3.length() == 0) {
                    InputWithIndicator inputWithIndicator2 = (InputWithIndicator) this.f64796a.c(R.id.a5k);
                    if (inputWithIndicator2 == null || (text2 = inputWithIndicator2.getText()) == null || text2.length() == 0) {
                        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) this.f64796a.c(R.id.a5i);
                        if ((inputWithIndicator3 == null || (text = inputWithIndicator3.getText()) == null || text.length() == 0) && (inputResultIndicator = (InputResultIndicator) this.f64796a.c(R.id.a5j)) != null) {
                            inputResultIndicator.a();
                        }
                    }
                }
            }
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f64795a;

        static {
            Covode.recordClassIndex(39823);
        }

        a(b bVar) {
            this.f64795a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!l.a((Object) ((InputWithIndicator) this.f64795a.c(R.id.a5k)).getText(), (Object) ((InputWithIndicator) this.f64795a.c(R.id.a5i)).getText())) {
                b bVar = this.f64795a;
                String string = bVar.getString(R.string.dah);
                l.b(string, "");
                bVar.a(0, string);
                return;
            }
            ((LoadingButton) this.f64795a.c(R.id.a5l)).a(true);
            b bVar2 = this.f64795a;
            String text = ((InputWithIndicator) bVar2.c(R.id.a5m)).getText();
            String text2 = ((InputWithIndicator) this.f64795a.c(R.id.a5k)).getText();
            l.d(bVar2, "");
            l.d(text, "");
            l.d(text2, "");
            n a2 = n.a((q) new x.co(bVar2, text, text2));
            l.b(a2, "");
            z.a(bVar2, a2).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.a5j);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        c.a(((InputWithIndicator) c(R.id.a5m)).getEditText(), this.f64793a);
        c.a(((InputWithIndicator) c(R.id.a5k)).getEditText(), this.f64793a);
        c.a(((InputWithIndicator) c(R.id.a5i)).getEditText(), this.f64793a);
        a(c(R.id.a5l), new a(this));
    }
}
