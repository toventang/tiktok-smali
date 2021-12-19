package com.lynx.devtoolwrapper;

import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.i;
import com.lynx.tasm.e;
import java.lang.ref.WeakReference;

public class d {

    /* renamed from: f  reason: collision with root package name */
    private static final String f55439f = d.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public b f55440a;

    /* renamed from: b  reason: collision with root package name */
    public c f55441b;

    /* renamed from: c  reason: collision with root package name */
    public i f55442c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<LynxView> f55443d;

    /* renamed from: e  reason: collision with root package name */
    public e f55444e;

    static {
        Covode.recordClassIndex(34718);
    }

    public d(LynxView lynxView, LynxTemplateRender lynxTemplateRender) {
        try {
            String str = f55439f;
            LLog.a(4, str, "Initialize LynxDevtool, lynxDebugEnabled:" + LynxEnv.b().f55537g);
            this.f55443d = new WeakReference<>(lynxView);
            if (LynxEnv.b().f55537g) {
                LLog.a(4, str, "devtoolEnabled:" + LynxEnv.b().d() + ", redBoxEnabled:" + LynxEnv.b().e());
                Object newInstance = Class.forName("com.lynx.devtool.LynxDevtoolManager").getConstructor(LynxView.class).newInstance(lynxView);
                if (newInstance instanceof e) {
                    this.f55444e = (e) newInstance;
                }
                if (LynxEnv.b().d()) {
                    Object newInstance2 = Class.forName("com.lynx.devtool.LynxInspectorOwner").getConstructor(LynxView.class).newInstance(lynxView);
                    if (newInstance2 instanceof a) {
                        this.f55440a = (b) newInstance2;
                    }
                }
                if (LynxEnv.b().e()) {
                    Object newInstance3 = Class.forName("com.lynx.devtool.redbox.RedBoxManager").getConstructor(Context.class, LynxTemplateRender.class).newInstance(lynxTemplateRender.getLynxContext().getBaseContext(), lynxTemplateRender);
                    if (newInstance3 instanceof c) {
                        this.f55441b = (c) newInstance3;
                        if (this.f55440a != null) {
                            new Runnable() {
                                /* class com.lynx.devtoolwrapper.d.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(34719);
                                }

                                public final void run() {
                                }
                            };
                        }
                    }
                }
                DisplayMetrics displayMetrics = lynxTemplateRender.getLynxContext().p;
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                float f2 = displayMetrics.density;
            }
            if (this.f55440a != null || this.f55441b != null) {
                this.f55442c = new i(lynxTemplateRender);
            }
        } catch (Exception e2) {
            LLog.a(6, f55439f, "failed to init LynxDevtool: " + e2.toString());
            this.f55440a = null;
            this.f55441b = null;
            this.f55442c = null;
        }
    }

    public final void a(byte[] bArr, TemplateData templateData, String str) {
        i iVar = this.f55442c;
        if (iVar != null) {
            iVar.f55767c = false;
            iVar.f55766b = true;
            iVar.f55768d.f55771a = bArr;
            iVar.f55768d.f55772b = str;
            iVar.f55768d.f55773c = templateData;
            iVar.f55765a = str;
        }
    }
}
