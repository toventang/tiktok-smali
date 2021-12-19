package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UIView;
import java.util.ArrayList;
import java.util.List;

public class d implements b {
    static {
        Covode.recordClassIndex(34925);
    }

    @Override // com.lynx.tasm.behavior.b
    public final List<a> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("view") {
            /* class com.lynx.tasm.behavior.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34926);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxUI a(j jVar) {
                return new UIView(jVar);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxFlattenUI b(j jVar) {
                return new LynxFlattenUI(jVar);
            }
        });
        arrayList.add(new a("text") {
            /* class com.lynx.tasm.behavior.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34927);
            }

            @Override // com.lynx.tasm.behavior.a
            public final ShadowNode a() {
                return new TextShadowNode();
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxFlattenUI b(j jVar) {
                return new FlattenUIText(jVar);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxUI a(j jVar) {
                return new UIText(jVar);
            }
        });
        arrayList.add(new a("raw-text") {
            /* class com.lynx.tasm.behavior.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(34928);
            }

            @Override // com.lynx.tasm.behavior.a
            public final ShadowNode a() {
                return new RawTextShadowNode();
            }
        });
        arrayList.add(new a("inline-text") {
            /* class com.lynx.tasm.behavior.d.AnonymousClass4 */

            static {
                Covode.recordClassIndex(34929);
            }

            @Override // com.lynx.tasm.behavior.a
            public final ShadowNode a() {
                return new InlineTextShadowNode();
            }
        });
        arrayList.add(new a("scroll-view") {
            /* class com.lynx.tasm.behavior.d.AnonymousClass5 */

            static {
                Covode.recordClassIndex(34930);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxUI a(j jVar) {
                return new UIScrollView(jVar);
            }
        });
        arrayList.add(new a("component") {
            /* class com.lynx.tasm.behavior.d.AnonymousClass6 */

            static {
                Covode.recordClassIndex(34931);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxUI a(j jVar) {
                return new UIComponent(jVar);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxFlattenUI b(j jVar) {
                return new LynxFlattenUI(jVar);
            }
        });
        arrayList.add(new a("list") {
            /* class com.lynx.tasm.behavior.d.AnonymousClass7 */

            static {
                Covode.recordClassIndex(34932);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxUI a(j jVar) {
                return new UIList(jVar);
            }
        });
        return arrayList;
    }
}
