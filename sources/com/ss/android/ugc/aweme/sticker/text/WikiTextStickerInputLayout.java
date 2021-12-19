package com.ss.android.ugc.aweme.sticker.text;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.editSticker.text.view.i;
import com.ss.android.ugc.aweme.port.in.bo;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.n;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public class WikiTextStickerInputLayout extends i {
    static {
        Covode.recordClassIndex(88713);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.i
    public final void e() {
        boolean a2 = l.f115658a.C().a();
        if (g.a().A().a() || !a2 || cr.a().o.booleanValue() || n.f129512a) {
            this.v.setVisibility(8);
        } else {
            this.v.setVisibility(0);
        }
        this.v.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(88714);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (WikiTextStickerInputLayout.this.F + WikiTextStickerInputLayout.this.E.size() >= 100) {
                    new a(WikiTextStickerInputLayout.this.getContext()).a(R.string.b2e).a();
                } else if (WikiTextStickerInputLayout.this.E.size() >= 10) {
                    new a(WikiTextStickerInputLayout.this.getContext()).a(R.string.b2d).a();
                } else {
                    if (WikiTextStickerInputLayout.this.D != null) {
                        WikiTextStickerInputLayout.this.D.b();
                    }
                    if (WikiTextStickerInputLayout.this.C != null) {
                        WikiTextStickerInputLayout.this.C.a();
                    }
                    WikiTextStickerInputLayout.this.v.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(88715);
                        }

                        public final void run() {
                            l.f115658a.C().a(new bo() {
                                /* class com.ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(88716);
                                }

                                @Override // com.ss.android.ugc.aweme.port.in.bo
                                public final void a(final com.ss.android.ugc.aweme.common.a aVar) {
                                    l.f115658a.C().b(this);
                                    WikiTextStickerInputLayout.this.v.postDelayed(new Runnable() {
                                        /* class com.ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout.AnonymousClass1.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(88717);
                                        }

                                        public final void run() {
                                            String str;
                                            WikiTextStickerInputLayout.this.D.a();
                                            if (aVar != null && WikiTextStickerInputLayout.this.D != null) {
                                                String title = aVar.getTitle();
                                                if (!TextUtils.isEmpty(title)) {
                                                    int selectionStart = WikiTextStickerInputLayout.this.f88680h.getSelectionStart();
                                                    String str2 = " _" + title + " ";
                                                    TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = new TextStickerTextUnderlineIndexRange(selectionStart, str2.length() + selectionStart);
                                                    t.a(WikiTextStickerInputLayout.this.E, selectionStart, str2.length());
                                                    WikiTextStickerInputLayout.this.E.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange, com.ss.android.ugc.aweme.story.h.a.a(aVar)));
                                                    String str3 = "";
                                                    if (selectionStart > 0) {
                                                        str = WikiTextStickerInputLayout.this.getEditTextStr().substring(0, selectionStart);
                                                    } else {
                                                        str = str3;
                                                    }
                                                    if (selectionStart < WikiTextStickerInputLayout.this.getEditTextStr().length()) {
                                                        str3 = WikiTextStickerInputLayout.this.getEditTextStr().substring(selectionStart);
                                                    }
                                                    WikiTextStickerInputLayout.this.f88680h.a(str + str2 + str3, selectionStart + str2.length());
                                                }
                                            }
                                        }
                                    }, 500);
                                }
                            });
                            if (WikiTextStickerInputLayout.this.C != null) {
                                l.f115658a.C().a(WikiTextStickerInputLayout.this.getContext(), WikiTextStickerInputLayout.this.C.b());
                            } else {
                                l.f115658a.C().a(WikiTextStickerInputLayout.this.getContext(), new HashMap());
                            }
                        }
                    }, 500);
                }
            }
        });
    }

    public WikiTextStickerInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
