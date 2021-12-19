package com.lynx.tasm.ui.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.h.a;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.c.b;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.j.d;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.i;
import com.lynx.tasm.behavior.shadow.j;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import com.lynx.tasm.behavior.v;

public class FrescoInlineImageShadowNode extends AbsInlineImageShadowNode {

    /* renamed from: a  reason: collision with root package name */
    public String f56879a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f56880b;

    /* renamed from: c  reason: collision with root package name */
    private q.b f56881c = q.b.f47436b;
    private final b p = c.b();
    private boolean q;
    private boolean r;
    private final com.facebook.drawee.c.c s = new com.facebook.drawee.c.c() {
        /* class com.lynx.tasm.ui.image.FrescoInlineImageShadowNode.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35411);
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            String message;
            super.onFailure(str, th);
            if (th == null) {
                message = "unknown";
            } else {
                message = th.getMessage();
            }
            FrescoInlineImageShadowNode.this.a(message);
            FrescoInlineImageShadowNode.this.h().a(FrescoInlineImageShadowNode.this.f56879a, "image", message);
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            super.onFinalImageSet(str, obj, animatable);
            if (obj instanceof d) {
                a<Bitmap> f2 = ((d) obj).f();
                if (f2 == null) {
                    FrescoInlineImageShadowNode.this.a("reference null");
                    FrescoInlineImageShadowNode.this.h().a(FrescoInlineImageShadowNode.this.f56879a, "image", "reference null");
                    return;
                }
                Bitmap a2 = f2.a();
                if (a2 == null) {
                    FrescoInlineImageShadowNode.this.a("bitmap null");
                    FrescoInlineImageShadowNode.this.h().a(FrescoInlineImageShadowNode.this.f56879a, "image", "bitmap null");
                    return;
                }
                FrescoInlineImageShadowNode.this.a(a2.getWidth(), a2.getHeight());
            } else if (animatable instanceof com.facebook.fresco.animation.c.a) {
                com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                FrescoInlineImageShadowNode.this.a(aVar.getIntrinsicWidth(), aVar.getIntrinsicHeight());
                com.lynx.tasm.ui.image.b.b.a(aVar);
            }
        }
    };

    static {
        Covode.recordClassIndex(35409);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final com.lynx.tasm.behavior.ui.text.a b() {
        MethodCollector.i(723);
        Resources resources = h().getResources();
        j jVar = this.f55955g;
        float nativeGetWidth = jVar.f55973a.nativeGetWidth(jVar.f55973a.f55952d);
        j jVar2 = this.f55955g;
        float nativeGetHeight = jVar2.f55973a.nativeGetHeight(jVar2.f55973a.f55952d);
        j jVar3 = this.f55955g;
        c cVar = new c(resources, (int) Math.ceil((double) nativeGetWidth), (int) Math.ceil((double) nativeGetHeight), jVar3.f55973a.nativeGetMargin(jVar3.f55973a.f55952d), this.f56880b, this.f56881c, this.p, this.s);
        i iVar = this.f55961l;
        if (iVar != null) {
            int i2 = iVar.f55971a;
            float f2 = iVar.f55972b;
            cVar.f56359c = i2;
            cVar.f56360d = f2;
        }
        MethodCollector.o(723);
        return cVar;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void g() {
        if (this.q) {
            Uri uri = null;
            if (this.f56879a != null) {
                if (!this.r) {
                    this.f56879a = com.lynx.tasm.behavior.ui.image.a.a(h(), this.f56879a);
                }
                Uri parse = Uri.parse(this.f56879a);
                if (parse.getScheme() == null) {
                    LLog.d("Lynx", "Image src should not be relative url : " + this.f56879a);
                } else {
                    uri = parse;
                }
            }
            this.f56880b = uri;
            this.q = false;
        }
    }

    @m(a = "skip-redirection", f = false)
    public void setSkipRedirection(boolean z) {
        this.r = z;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public void setMode(String str) {
        this.f56881c = g.a(str);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public void setSource(String str) {
        this.f56879a = str;
        this.q = true;
        d();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void b(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                int hashCode = nextKey.hashCode();
                if (hashCode != -1338903714) {
                    if (hashCode != 114148) {
                        if (hashCode == 3357091) {
                            if (nextKey.equals("mode")) {
                                setMode(readableMap.getString(nextKey));
                            }
                        }
                    } else if (nextKey.equals("src")) {
                        setSource(readableMap.getString(nextKey));
                    }
                } else if (nextKey.equals("skip-redirection")) {
                    setSkipRedirection(readableMap.getBoolean(nextKey, false));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e2.toString());
            }
        }
        super.b(vVar);
    }
}
