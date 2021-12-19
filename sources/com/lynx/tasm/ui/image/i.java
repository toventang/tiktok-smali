package com.lynx.tasm.ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.a;
import com.lynx.tasm.behavior.b;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.image.AutoSizeImage;
import java.util.ArrayList;
import java.util.List;

public final class i {
    static {
        Covode.recordClassIndex(35447);
    }

    public static b a() {
        return new b() {
            /* class com.lynx.tasm.ui.image.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35448);
            }

            @Override // com.lynx.tasm.behavior.b
            public final List<a> a() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new a("image") {
                    /* class com.lynx.tasm.ui.image.i.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35449);
                    }

                    @Override // com.lynx.tasm.behavior.a
                    public final ShadowNode a() {
                        return new AutoSizeImage();
                    }

                    @Override // com.lynx.tasm.behavior.a
                    public final com.lynx.tasm.a b() {
                        return new m();
                    }

                    @Override // com.lynx.tasm.behavior.a
                    public final LynxUI a(j jVar) {
                        return new UIImage(jVar);
                    }

                    @Override // com.lynx.tasm.behavior.a
                    public final LynxFlattenUI b(j jVar) {
                        return new FlattenUIImage(jVar);
                    }
                });
                arrayList.add(new a("filter-image") {
                    /* class com.lynx.tasm.ui.image.i.AnonymousClass1.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(35450);
                    }

                    @Override // com.lynx.tasm.behavior.a
                    public final LynxUI a(j jVar) {
                        return new UIFilterImage(jVar);
                    }
                });
                arrayList.add(new a("inline-image") {
                    /* class com.lynx.tasm.ui.image.i.AnonymousClass1.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(35451);
                    }

                    @Override // com.lynx.tasm.behavior.a
                    public final ShadowNode a() {
                        return new FrescoInlineImageShadowNode();
                    }
                });
                return arrayList;
            }
        };
    }
}
