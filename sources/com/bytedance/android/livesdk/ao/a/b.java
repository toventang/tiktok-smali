package com.bytedance.android.livesdk.ao.a;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.e;
import com.bytedance.android.live.uikit.textview.AlwaysMarqueeTextView;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class b extends v {

    /* renamed from: c  reason: collision with root package name */
    public static f f13976c;

    /* renamed from: d  reason: collision with root package name */
    public static com.bytedance.android.livesdk.ap.b<?> f13977d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f13978e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f13979a;

    /* renamed from: b  reason: collision with root package name */
    public LiveEditText f13980b;

    /* renamed from: f  reason: collision with root package name */
    private LiveButton f13981f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f13982g;

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f13982g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f13982g == null) {
            this.f13982g = new HashMap();
        }
        View view = (View) this.f13982g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13982g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7758);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.bytedance.android.livesdk.ao.a.b$a$a  reason: collision with other inner class name */
        public static final class C0295a implements c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdk.ap.b f13983a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f13984b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f13985c;

            static {
                Covode.recordClassIndex(7759);
            }

            @Override // com.bytedance.android.livesdk.ao.a.c
            public final void a(Editable editable) {
                String str;
                Throwable th;
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                try {
                    Object a2 = this.f13983a.a();
                    if (a2 instanceof Integer) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, Integer.valueOf(Integer.parseInt(str)));
                    } else if (a2 instanceof Double) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, Double.valueOf(Double.parseDouble(str)));
                    } else if (a2 instanceof Float) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, Float.valueOf(Float.parseFloat(str)));
                    } else if (a2 instanceof Long) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, Long.valueOf(Long.parseLong(str)));
                    } else if (a2 instanceof Byte) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, Byte.valueOf(Byte.parseByte(str)));
                    } else if (a2 instanceof Character) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, Character.valueOf(str.charAt(0)));
                    } else if (a2 instanceof Short) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, Short.valueOf(Short.parseShort(str)));
                    } else if (a2 instanceof Boolean) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, Boolean.valueOf(Boolean.parseBoolean(str)));
                    } else if (a2 instanceof String) {
                        com.bytedance.android.livesdk.ap.c.a(this.f13983a, str);
                    } else {
                        com.bytedance.android.livesdk.ap.b<?> bVar = b.f13977d;
                        if (bVar != null) {
                            Object a3 = b.f13976c.a(str, (Class) bVar.a().getClass());
                            l.b(a3, "");
                            com.bytedance.android.livesdk.ap.c.a(this.f13983a, a3);
                        }
                    }
                    ao.a(y.e(), "save success!!", 0);
                    this.f13984b.invoke();
                } catch (Exception unused) {
                    ao.a(y.e(), "save error, because your value is not right!", 0);
                } catch (Throwable th2) {
                    th = th2;
                }
                this.f13985c.d();
                this.f13985c.dismiss();
                return;
                this.f13985c.d();
                this.f13985c.dismiss();
                throw th;
            }

            C0295a(com.bytedance.android.livesdk.ap.b bVar, h.f.a.a aVar, b bVar2) {
                this.f13983a = bVar;
                this.f13984b = aVar;
                this.f13985c = bVar2;
            }
        }
    }

    public final void d() {
        LiveEditText liveEditText = this.f13980b;
        if (liveEditText != null) {
            p.b((EditText) liveEditText);
        }
    }

    public final void e() {
        LiveButton liveButton = this.f13981f;
        if (liveButton != null) {
            liveButton.setOnClickListener(new c(this));
        }
    }

    static {
        Covode.recordClassIndex(7757);
        f fVar = e.a.f9628b;
        l.b(fVar, "");
        f13976c = fVar;
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.bb7);
        bVar.f22385l = 48;
        bVar.f22380g = 17;
        bVar.f22381h = -1;
        bVar.f22382i = -2;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.ao.a.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0296b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13986a;

        static {
            Covode.recordClassIndex(7760);
        }

        View$OnClickListenerC0296b(b bVar) {
            this.f13986a = bVar;
        }

        public final void onClick(View view) {
            this.f13986a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13987a;

        static {
            Covode.recordClassIndex(7761);
        }

        c(b bVar) {
            this.f13987a = bVar;
        }

        public final void onClick(View view) {
            Editable editable;
            LiveEditText liveEditText = this.f13987a.f13980b;
            if (liveEditText != null) {
                editable = liveEditText.getText();
            } else {
                editable = null;
            }
            c cVar = this.f13987a.f13979a;
            if (cVar != null) {
                cVar.a(editable);
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Class<?> cls;
        String str;
        Object a2;
        String str2 = "";
        l.d(view, str2);
        super.onViewCreated(view, bundle);
        AlwaysMarqueeTextView alwaysMarqueeTextView = (AlwaysMarqueeTextView) view.findViewById(R.id.f1_);
        AlwaysMarqueeTextView alwaysMarqueeTextView2 = (AlwaysMarqueeTextView) view.findViewById(R.id.f_e);
        LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.ay7);
        this.f13980b = liveEditText;
        com.bytedance.android.livesdk.ap.b<?> bVar = f13977d;
        Object obj = null;
        if (bVar == null || (a2 = bVar.a()) == null) {
            cls = null;
        } else {
            cls = a2.getClass();
        }
        Object i2 = n.i((List) h.m.p.b(String.valueOf(cls), new String[]{"."}));
        if (alwaysMarqueeTextView != null) {
            Object[] objArr = new Object[1];
            com.bytedance.android.livesdk.ap.b<?> bVar2 = f13977d;
            if (!(bVar2 == null || (str = bVar2.f13991a) == null)) {
                str2 = str;
            }
            objArr[0] = str2;
            alwaysMarqueeTextView.setText(y.a((int) R.string.gym, objArr));
        }
        if (alwaysMarqueeTextView2 != null) {
            alwaysMarqueeTextView2.setText(y.a((int) R.string.gyo, i2));
        }
        if (liveEditText != null) {
            com.bytedance.android.livesdk.ap.b<?> bVar3 = f13977d;
            if (bVar3 != null) {
                obj = bVar3.a();
            }
            liveEditText.setText(String.valueOf(obj));
        }
        this.f13981f = (LiveButton) view.findViewById(R.id.zk);
        LiveButton liveButton = (LiveButton) view.findViewById(R.id.xx);
        e();
        if (liveButton != null) {
            liveButton.setOnClickListener(new View$OnClickListenerC0296b(this));
        }
    }
}
