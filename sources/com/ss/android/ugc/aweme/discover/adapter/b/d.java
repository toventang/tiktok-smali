package com.ss.android.ugc.aweme.discover.adapter.b;

import android.content.DialogInterface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.google.gson.o;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.discover.g.a;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.search.k.bf;
import com.ss.android.ugc.aweme.search.k.bg;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class d extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: i  reason: collision with root package name */
    private static final int f80464i = n.a(44.0d);

    /* renamed from: a  reason: collision with root package name */
    public List<e> f80465a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public String f80466b;

    /* renamed from: c  reason: collision with root package name */
    public String f80467c;

    /* renamed from: d  reason: collision with root package name */
    public String f80468d;

    /* renamed from: e  reason: collision with root package name */
    public a f80469e;

    /* renamed from: f  reason: collision with root package name */
    public SearchIntermediateViewModel f80470f;

    /* renamed from: g  reason: collision with root package name */
    androidx.fragment.app.e f80471g;

    /* renamed from: h  reason: collision with root package name */
    public String f80472h;

    /* renamed from: j  reason: collision with root package name */
    private SugCompletionView.a f80473j;

    /* renamed from: k  reason: collision with root package name */
    private e f80474k;

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public final void a() {
        List<e> list = this.f80465a;
        if (list != null) {
            list.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f80465a.size();
    }

    static {
        Covode.recordClassIndex(50079);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof b) {
            ((b) viewHolder).f80447d = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof b) {
            ((b) viewHolder).f80447d = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        e eVar;
        if (b.a((Collection) this.f80465a) || (eVar = this.f80465a.get(i2)) == null) {
            return 0;
        }
        return l.a(eVar, this.f80467c);
    }

    public d(androidx.fragment.app.e eVar) {
        this.f80471g = eVar;
        if (eVar != null) {
            this.f80470f = (SearchIntermediateViewModel) ae.a(eVar, (ad.b) null).a(SearchIntermediateViewModel.class);
        }
        this.f80473j = new SugCompletionView.a() {
            /* class com.ss.android.ugc.aweme.discover.adapter.b.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(50080);
            }

            @Override // com.ss.android.ugc.aweme.discover.widget.SugCompletionView.a
            public final void a() {
                if (d.this.f80470f != null) {
                    d.this.f80470f.getDismissKeyboard().setValue(true);
                }
            }

            @Override // com.ss.android.ugc.aweme.discover.widget.SugCompletionView.a
            public final void a(boolean z) {
                if (d.this.f80470f != null) {
                    d.this.f80470f.getDismissKeyboardOnActionDown().setValue(Boolean.valueOf(z));
                }
            }

            @Override // com.ss.android.ugc.aweme.discover.widget.SugCompletionView.a
            public final void a(e eVar, int i2) {
                d dVar = d.this;
                if (dVar.f80471g != null) {
                    a.C0731a aVar = new a.C0731a(dVar.f80471g);
                    aVar.f33401a = dVar.f80471g.getString(R.string.gac);
                    aVar.f33402b = dVar.f80471g.getString(R.string.gaa);
                    aVar.a(dVar.f80471g.getString(R.string.ga_), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(eVar, i2) {
                        /* class com.ss.android.ugc.aweme.discover.adapter.b.d.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ e f80479a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f80480b;

                        static {
                            Covode.recordClassIndex(50082);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            Word word;
                            String str;
                            d dVar = d.this;
                            e eVar = this.f80479a;
                            int i3 = this.f80480b;
                            if (!(dVar.f80471g == null || (word = eVar.f121523f) == null)) {
                                Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "suggestion").appendQueryParameter("object_id", word.getWord()).appendQueryParameter("owner_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId());
                                o oVar = new o();
                                try {
                                    oVar.a("raw_query", dVar.f80472h);
                                    oVar.a("words_content", word.getWord());
                                    oVar.a("words_position", Integer.valueOf(i3));
                                    oVar.a("impr_id", dVar.f80466b);
                                    oVar.a("group_id", word.getId());
                                    oVar.a("words_source", "sug");
                                    str = dg.a().b(oVar);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    str = "";
                                }
                                appendQueryParameter.appendQueryParameter("extra", str);
                                com.ss.android.ugc.aweme.compliance.api.a.a().a(dVar.f80471g, appendQueryParameter);
                            }
                            dialogInterface.dismiss();
                            d dVar2 = d.this;
                            e eVar2 = this.f80479a;
                            int i4 = this.f80480b;
                            Word word2 = eVar2.f121523f;
                            if (word2 != null) {
                                ((bf) new bf().x(dVar2.f80472h).w(word2.getWord()).d(Integer.valueOf(i4)).d(dVar2.f80466b).i(word2.getId())).r("confirm").s("sug").f();
                            }
                        }

                        {
                            this.f80479a = r2;
                            this.f80480b = r3;
                        }
                    }, false).b(dVar.f80471g.getString(R.string.ga9), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(eVar, i2) {
                        /* class com.ss.android.ugc.aweme.discover.adapter.b.d.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ e f80476a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f80477b;

                        static {
                            Covode.recordClassIndex(50081);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            dialogInterface.dismiss();
                            d dVar = d.this;
                            e eVar = this.f80476a;
                            int i3 = this.f80477b;
                            Word word = eVar.f121523f;
                            if (word != null) {
                                ((bf) new bf().x(dVar.f80472h).w(word.getWord()).d(Integer.valueOf(i3)).d(dVar.f80466b).i(word.getId())).r("cancel").s("sug").f();
                            }
                        }

                        {
                            this.f80476a = r2;
                            this.f80477b = r3;
                        }
                    }, false).a().c();
                    Word word = eVar.f121523f;
                    if (word != null) {
                        ((bg) new bg().x(dVar.f80472h).w(word.getWord()).d(Integer.valueOf(i2)).d(dVar.f80466b).i(word.getId())).r("sug").f();
                    }
                }
                d.this.a(false);
                d.this.notifyDataSetChanged();
            }
        };
    }

    public final void a(boolean z) {
        if (this.f80465a != null) {
            if (this.f80474k == null) {
                e eVar = new e();
                this.f80474k = eVar;
                eVar.f121525h = 3;
            }
            if (z) {
                this.f80465a.add(this.f80474k);
            } else {
                this.f80465a.remove(this.f80474k);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0361, code lost:
        if (r0 == null) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0368, code lost:
        if (r0.isVerifiedUser() != true) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x036a, code lost:
        r8.append((java.lang.CharSequence) " T");
        r8.setSpan(new com.ss.android.ugc.aweme.profile.f.aj(r11.f80432d.getContext(), com.zhiliaoapp.musically.R.drawable.abm), (r8.length() - 2) + 1, r8.length(), 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x038b, code lost:
        r1 = r11.f80432d.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0391, code lost:
        if (r3 == null) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0393, code lost:
        r0 = r3.f121524g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0395, code lost:
        if (r0 == null) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0397, code lost:
        r6 = r0.getUserRelationType();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x039b, code lost:
        r6 = com.ss.android.ugc.aweme.discover.helper.ah.a(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03a3, code lost:
        if (r6.length() <= 0) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03a5, code lost:
        r8.append((java.lang.CharSequence) " • ");
        r8.append((java.lang.CharSequence) r6);
        r8.setSpan(new android.text.style.ForegroundColorSpan(androidx.core.content.b.c(r11.f80432d.getContext(), com.zhiliaoapp.musically.R.color.c5)), (r8.length() - 3) - r6.length(), r8.length(), 33);
        r1 = new android.text.style.StyleSpan(1);
        r7 = r8.length() - r6.length();
        r6 = r8.length();
        r8.setSpan(r1, r7, r6, 17);
        r8.setSpan(new android.text.style.AbsoluteSizeSpan((int) com.ss.android.ugc.aweme.utils.by.a()), r7, r6, 18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03f8, code lost:
        r7 = r11.a();
        r0 = r11.itemView;
        h.f.b.l.b(r0, r2);
        r6 = r0.getContext();
        h.f.b.l.b(r6, r2);
        r1 = r4.getUserNickname();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x040c, code lost:
        if (r1 != null) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x040e, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x040f, code lost:
        if (r3 == null) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0411, code lost:
        r0 = r3.f121522e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0413, code lost:
        if (r0 != null) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0415, code lost:
        r0 = new java.util.ArrayList<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x041a, code lost:
        r1 = r7.a(r6, r1, r0);
        r0 = (com.bytedance.tux.input.TuxTextView) r11.f80429a.getValue();
        h.f.b.l.b(r0, r2);
        r0.setText(r8);
        r0 = (com.bytedance.tux.input.TuxTextView) r11.f80430b.getValue();
        h.f.b.l.b(r0, r2);
        r0.setText(r1);
        r11.f80432d.setOnTouchListener(new com.ss.android.ugc.aweme.discover.adapter.b.a.e(r11, r3, r5, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0444, code lost:
        if (r3 == null) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0446, code lost:
        r2 = r3.f121528k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0448, code lost:
        if (r2 == null) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x044a, code lost:
        r2.put("user_tag", r4.getUserRelationType());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0453, code lost:
        r2 = r11.f80431c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0455, code lost:
        if (r3 == null) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0457, code lost:
        r1 = r3.f121526i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0459, code lost:
        com.ss.android.ugc.aweme.discover.adapter.b.g.a(r2, r1, r3, "user_enrich_sug");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x045e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x045f, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0349, code lost:
        if (r3 != null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x034d, code lost:
        if (r0 == null) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x034f, code lost:
        r0 = new java.util.ArrayList<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0354, code lost:
        r8.append((java.lang.CharSequence) r9.a(r7, r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x035d, code lost:
        if (r3 == null) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x035f, code lost:
        r0 = r3.f121524g;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r23, int r24) {
        /*
        // Method dump skipped, instructions count: 1161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.b.d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        int i3;
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(1860);
        if (com.ss.android.ugc.aweme.discover.a.a.a(dVar.f80467c)) {
            i3 = f80464i;
        } else {
            i3 = 0;
        }
        boolean z = true;
        if (i2 == 1) {
            String str = dVar.f80468d;
            com.ss.android.ugc.aweme.discover.g.a aVar = dVar.f80469e;
            l.d(viewGroup, "");
            l.d(aVar, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw0, viewGroup, false);
            l.b(a2, "");
            viewHolder = new f(a2, str, i3, aVar);
        } else if (i2 == 2) {
            String str2 = dVar.f80468d;
            com.ss.android.ugc.aweme.discover.g.a aVar2 = dVar.f80469e;
            SugCompletionView.a aVar3 = dVar.f80473j;
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avy, viewGroup, false);
            l.b(a3, "");
            viewHolder = new b(a3, str2, i3, aVar2, aVar3);
        } else if (i2 == 3) {
            l.d(viewGroup, "");
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw6, viewGroup, false);
            l.b(a4, "");
            viewHolder = new m(a4);
        } else if (i2 == 0) {
            viewHolder = new h(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avz, viewGroup, false), i3, dVar.f80468d, dVar.f80469e, dVar.f80473j);
        } else if (i2 == 4) {
            String str3 = dVar.f80468d;
            com.ss.android.ugc.aweme.discover.g.a aVar4 = dVar.f80469e;
            SugCompletionView.a aVar5 = dVar.f80473j;
            l.d(viewGroup, "");
            l.d(aVar4, "");
            l.d(aVar5, "");
            View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.av9, viewGroup, false);
            l.b(a5, "");
            viewHolder = new a(a5, str3, aVar4, aVar5);
        } else if (i2 == 5) {
            l.d(viewGroup, "");
            View a6 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.av_, viewGroup, false);
            l.b(a6, "");
            viewHolder = new c(a6);
        } else {
            viewHolder = null;
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(1860);
        return viewHolder;
    }
}
