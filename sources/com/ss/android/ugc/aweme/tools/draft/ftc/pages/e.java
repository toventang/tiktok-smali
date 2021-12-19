package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ae.f;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView;
import com.ss.android.ugc.aweme.tools.draft.ai;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCDraftItemView;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class e extends com.ss.android.ugc.tools.view.b.a<com.ss.android.ugc.aweme.draft.model.c> implements FTCAwemeDraftViewHolder.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f139584e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f139585a;

    /* renamed from: b  reason: collision with root package name */
    boolean f139586b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f139587c = true;

    /* renamed from: d  reason: collision with root package name */
    public i f139588d;
    private final Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> r;
    private final FTCAwemeDraftViewHolder.a s;

    static {
        Covode.recordClassIndex(91257);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91258);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean b() {
        for (com.ss.android.ugc.aweme.draft.model.c cVar : this.f150019f) {
            if (cVar != null && cVar.a()) {
                return true;
            }
        }
        return false;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f139589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f139590b;

        static {
            Covode.recordClassIndex(91259);
        }

        b(e eVar, List list) {
            this.f139589a = eVar;
            this.f139590b = list;
        }

        public final void run() {
            final com.ss.android.ugc.aweme.draft.model.c cVar = null;
            for (com.ss.android.ugc.aweme.draft.model.c cVar2 : this.f139590b) {
                if (cVar2.y) {
                    e.b(cVar2);
                    cVar = cVar2;
                }
            }
            if (cVar != null) {
                i.b(new Callable() {
                    /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.e.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(91260);
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftDelete(cVar);
                        return z.f158842a;
                    }
                }, i.f4826c);
            }
        }
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final int a(int i2) {
        Object obj = this.f150019f.get(i2);
        l.b(obj, "");
        return ((com.ss.android.ugc.aweme.draft.model.c) obj).x;
    }

    public static void b(com.ss.android.ugc.aweme.draft.model.c cVar) {
        ae o = com.ss.android.ugc.aweme.port.in.l.f115658a.o();
        if (cVar == null) {
            l.b();
        }
        String r2 = cVar.r();
        l.b(r2, "");
        o.a(r2);
        ai.a().b(cVar, "user_click");
        com.ss.android.ugc.aweme.draft.model.d.g(cVar);
        com.ss.android.ugc.aweme.shortvideo.sticker.e.b(cVar.f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (((com.ss.android.ugc.aweme.draft.model.c) r0).x == 5) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (((com.ss.android.ugc.aweme.draft.model.c) r0).f83185f == null) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.draft.model.c r10) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ftc.pages.e.a(com.ss.android.ugc.aweme.draft.model.c):void");
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f139592a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f139593b;

        static {
            Covode.recordClassIndex(91261);
        }

        c(e eVar, com.ss.android.ugc.aweme.draft.model.c cVar) {
            this.f139592a = eVar;
            this.f139593b = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            e.b(this.f139593b);
            this.f139592a.a(this.f139593b);
            com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftDelete(this.f139593b);
        }
    }

    public e(Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> map, FTCAwemeDraftViewHolder.a aVar) {
        l.d(map, "");
        l.d(aVar, "");
        this.r = map;
        this.s = aVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder.a
    public final void a(int i2, com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        Iterator it = this.f150019f.iterator();
        int i3 = -1;
        int i4 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.ss.android.ugc.aweme.draft.model.c cVar2 = (com.ss.android.ugc.aweme.draft.model.c) it.next();
            l.b(cVar2, "");
            if (cVar2.x == 0) {
                i4++;
                if (cVar2 == cVar) {
                    i3 = i4;
                    break;
                }
            }
        }
        cVar.f83191l = i3;
        this.s.a(i2, cVar);
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f139594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f139595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f139596c;

        static {
            Covode.recordClassIndex(91262);
        }

        d(e eVar, View view, com.ss.android.ugc.aweme.draft.model.c cVar) {
            this.f139594a = eVar;
            this.f139595b = view;
            this.f139596c = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            e eVar = this.f139594a;
            Context context = this.f139595b.getContext();
            com.ss.android.ugc.aweme.draft.model.c cVar = this.f139596c;
            if (context == null) {
                l.b();
            }
            a.C0731a aVar = new a.C0731a(context);
            aVar.f33402b = context.getResources().getQuantityString(R.plurals.b3, 1);
            aVar.b(R.string.bcn, (DialogInterface.OnClickListener) null, false).a(R.string.bcm, (DialogInterface.OnClickListener) new c(eVar, cVar), false).a().b();
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder.a
    public final void a(View view, com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        if (view == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.tools.draft.l.a aVar = new com.ss.android.ugc.aweme.tools.draft.l.a(view.getContext());
        Context context = view.getContext();
        l.b(context, "");
        aVar.a(new String[]{context.getResources().getString(R.string.yh)}, new d(this, view, cVar));
        aVar.f139812a.b();
        this.s.a(view, cVar);
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 == 1) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_i, viewGroup, false);
            l.b(a2, "");
            return new f(false, a2);
        } else if (i2 == 2) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_h, viewGroup, false);
            l.b(a3, "");
            return new a(a3);
        } else if (i2 == 3) {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_j, viewGroup, false);
            l.b(a4, "");
            return new c(a4);
        } else if (i2 != 5) {
            View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_g, viewGroup, false);
            l.b(a5, "");
            return new FTCAwemeDraftViewHolder(a5, this.r, this);
        } else {
            View a6 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_i, viewGroup, false);
            l.b(a6, "");
            return new f(true, a6);
        }
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        MethodCollector.i(1666);
        l.d(viewHolder, "");
        if (viewHolder instanceof FTCAwemeDraftViewHolder) {
            FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = (FTCAwemeDraftViewHolder) viewHolder;
            fTCAwemeDraftViewHolder.f139563m = this.f139585a;
            fTCAwemeDraftViewHolder.n = this.f139587c;
            com.ss.android.ugc.aweme.draft.model.c cVar = (com.ss.android.ugc.aweme.draft.model.c) this.f150019f.get(i2);
            if (cVar == null || cVar.f83181b == null) {
                MethodCollector.o(1666);
                return;
            }
            fTCAwemeDraftViewHolder.t = cVar;
            if (fTCAwemeDraftViewHolder.f139563m) {
                FTCDraftItemView fTCDraftItemView = fTCAwemeDraftViewHolder.f139560j;
                if (fTCDraftItemView == null) {
                    l.a("mContainerLl");
                    l.b();
                }
                if (!fTCDraftItemView.f139572c) {
                    fTCDraftItemView.f139572c = true;
                    Scroller scroller = fTCDraftItemView.f139570a;
                    if (scroller == null) {
                        l.b();
                    }
                    scroller.startScroll(0, 0, -fTCDraftItemView.f139571b, 0, 200);
                    if (fTCDraftItemView.f139573d != null) {
                        FTCDraftItemView.a aVar = fTCDraftItemView.f139573d;
                        if (aVar == null) {
                            l.b();
                        }
                        aVar.a(fTCDraftItemView.f139571b, fTCDraftItemView.f139572c);
                    }
                }
                ImageView imageView = fTCAwemeDraftViewHolder.f139558h;
                if (imageView == null) {
                    l.a("mDraftPlay");
                    l.b();
                }
                imageView.animate().alpha(0.0f).setDuration(200).start();
            } else {
                FTCDraftItemView fTCDraftItemView2 = fTCAwemeDraftViewHolder.f139560j;
                if (fTCDraftItemView2 == null) {
                    l.a("mContainerLl");
                    l.b();
                }
                if (fTCDraftItemView2.f139572c) {
                    fTCDraftItemView2.f139572c = false;
                    Scroller scroller2 = fTCDraftItemView2.f139570a;
                    if (scroller2 == null) {
                        l.b();
                    }
                    scroller2.startScroll(-fTCDraftItemView2.f139571b, 0, fTCDraftItemView2.f139571b, 0, 200);
                    if (fTCDraftItemView2.f139573d != null) {
                        FTCDraftItemView.a aVar2 = fTCDraftItemView2.f139573d;
                        if (aVar2 == null) {
                            l.b();
                        }
                        aVar2.a(fTCDraftItemView2.f139571b, fTCDraftItemView2.f139572c);
                    }
                }
                ImageView imageView2 = fTCAwemeDraftViewHolder.f139558h;
                if (imageView2 == null) {
                    l.a("mDraftPlay");
                    l.b();
                }
                imageView2.animate().alpha(1.0f).setDuration(200).start();
                Object obj = fTCAwemeDraftViewHolder.t;
                if (obj == null) {
                    l.b();
                }
                ((com.ss.android.ugc.aweme.draft.model.c) obj).y = false;
            }
            if (fTCAwemeDraftViewHolder.n) {
                TextView textView = fTCAwemeDraftViewHolder.f139553c;
                if (textView == null) {
                    l.a("mDraftSize");
                    l.b();
                }
                textView.setText(com.ss.android.ugc.aweme.tools.draft.e.b.a(fTCAwemeDraftViewHolder.p, cVar));
            }
            AppCompatCheckBox appCompatCheckBox = fTCAwemeDraftViewHolder.f139559i;
            if (appCompatCheckBox == null) {
                l.a("mCheckBox");
                l.b();
            }
            appCompatCheckBox.setOnCheckedChangeListener(null);
            AppCompatCheckBox appCompatCheckBox2 = fTCAwemeDraftViewHolder.f139559i;
            if (appCompatCheckBox2 == null) {
                l.a("mCheckBox");
                l.b();
            }
            Object obj2 = fTCAwemeDraftViewHolder.t;
            if (obj2 == null) {
                l.b();
            }
            appCompatCheckBox2.setChecked(((com.ss.android.ugc.aweme.draft.model.c) obj2).y);
            AppCompatCheckBox appCompatCheckBox3 = fTCAwemeDraftViewHolder.f139559i;
            if (appCompatCheckBox3 == null) {
                l.a("mCheckBox");
                l.b();
            }
            appCompatCheckBox3.setOnCheckedChangeListener(new FTCAwemeDraftViewHolder.b(fTCAwemeDraftViewHolder));
            SimpleDraweeView simpleDraweeView = fTCAwemeDraftViewHolder.f139556f;
            if (simpleDraweeView == null) {
                l.a("mCover");
                l.b();
            }
            simpleDraweeView.setTag(cVar.r());
            SimpleDraweeView simpleDraweeView2 = fTCAwemeDraftViewHolder.f139556f;
            if (simpleDraweeView2 == null) {
                l.a("mCover");
                l.b();
            }
            simpleDraweeView2.setImageResource(2131232427);
            Object obj3 = fTCAwemeDraftViewHolder.t;
            if (obj3 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.draft.model.d.a((com.ss.android.ugc.aweme.draft.model.c) obj3, new FTCAwemeDraftViewHolder.c(fTCAwemeDraftViewHolder, cVar));
            if (!g.a().A().a()) {
                ExpandableMentionTextView expandableMentionTextView = fTCAwemeDraftViewHolder.f139551a;
                if (expandableMentionTextView == null) {
                    l.a("mAwemeTitle");
                    l.b();
                }
                expandableMentionTextView.setSpanColor(androidx.core.content.b.c(fTCAwemeDraftViewHolder.p, R.color.b9));
            } else {
                ExpandableMentionTextView expandableMentionTextView2 = fTCAwemeDraftViewHolder.f139551a;
                if (expandableMentionTextView2 == null) {
                    l.a("mAwemeTitle");
                    l.b();
                }
                expandableMentionTextView2.setSpanColor(androidx.core.content.b.c(fTCAwemeDraftViewHolder.p, R.color.bx));
            }
            com.ss.android.ugc.aweme.draft.model.a aVar3 = cVar.f83181b;
            l.b(aVar3, "");
            String str = aVar3.f83161a;
            if (m.a(str)) {
                ExpandableMentionTextView expandableMentionTextView3 = fTCAwemeDraftViewHolder.f139551a;
                if (expandableMentionTextView3 == null) {
                    l.a("mAwemeTitle");
                    l.b();
                }
                expandableMentionTextView3.setText(fTCAwemeDraftViewHolder.p.getText(R.string.bd9));
                ExpandableMentionTextView expandableMentionTextView4 = fTCAwemeDraftViewHolder.f139551a;
                if (expandableMentionTextView4 == null) {
                    l.a("mAwemeTitle");
                    l.b();
                }
                expandableMentionTextView4.setTextColor(androidx.core.content.b.c(fTCAwemeDraftViewHolder.p, R.color.c5));
            } else {
                ExpandableMentionTextView expandableMentionTextView5 = fTCAwemeDraftViewHolder.f139551a;
                if (expandableMentionTextView5 == null) {
                    l.a("mAwemeTitle");
                    l.b();
                }
                expandableMentionTextView5.setText(str);
                com.ss.android.ugc.aweme.draft.model.a aVar4 = cVar.f83181b;
                l.b(aVar4, "");
                if (aVar4.f83162b != null) {
                    ExpandableMentionTextView expandableMentionTextView6 = fTCAwemeDraftViewHolder.f139551a;
                    if (expandableMentionTextView6 == null) {
                        l.a("mAwemeTitle");
                        l.b();
                    }
                    com.ss.android.ugc.aweme.draft.model.a aVar5 = cVar.f83181b;
                    l.b(aVar5, "");
                    expandableMentionTextView6.a((List<TextExtraStruct>) f.a(aVar5.f83162b), false);
                    com.ss.android.ugc.aweme.draft.model.a aVar6 = cVar.f83181b;
                    l.b(aVar6, "");
                    for (AVTextExtraStruct aVTextExtraStruct : aVar6.f83162b) {
                        l.b(aVTextExtraStruct, "");
                        if (aVTextExtraStruct.getType() == 0) {
                            if (aVTextExtraStruct.getSubType() == 1) {
                                ExpandableMentionTextView expandableMentionTextView7 = fTCAwemeDraftViewHolder.f139551a;
                                if (expandableMentionTextView7 == null) {
                                    l.a("mAwemeTitle");
                                    l.b();
                                }
                                Context context = expandableMentionTextView7.getContext();
                                l.b(context, "");
                                ExpandableMentionTextView expandableMentionTextView8 = fTCAwemeDraftViewHolder.f139551a;
                                if (expandableMentionTextView8 == null) {
                                    l.a("mAwemeTitle");
                                    l.b();
                                }
                                com.ss.android.ugc.aweme.shortvideo.aa.a aVar7 = new com.ss.android.ugc.aweme.shortvideo.aa.a(context, expandableMentionTextView8);
                                ExpandableMentionTextView expandableMentionTextView9 = fTCAwemeDraftViewHolder.f139551a;
                                if (expandableMentionTextView9 == null) {
                                    l.a("mAwemeTitle");
                                    l.b();
                                }
                                expandableMentionTextView9.a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), aVar7);
                            }
                            if (aVTextExtraStruct.getSubType() == 2) {
                                ExpandableMentionTextView expandableMentionTextView10 = fTCAwemeDraftViewHolder.f139551a;
                                if (expandableMentionTextView10 == null) {
                                    l.a("mAwemeTitle");
                                    l.b();
                                }
                                Context context2 = expandableMentionTextView10.getContext();
                                l.b(context2, "");
                                ExpandableMentionTextView expandableMentionTextView11 = fTCAwemeDraftViewHolder.f139551a;
                                if (expandableMentionTextView11 == null) {
                                    l.a("mAwemeTitle");
                                    l.b();
                                }
                                com.ss.android.ugc.aweme.shortvideo.aa.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.aa.c(context2, expandableMentionTextView11);
                                ExpandableMentionTextView expandableMentionTextView12 = fTCAwemeDraftViewHolder.f139551a;
                                if (expandableMentionTextView12 == null) {
                                    l.a("mAwemeTitle");
                                    l.b();
                                }
                                Context context3 = expandableMentionTextView12.getContext();
                                l.b(context3, "");
                                cVar2.f124818a = BitmapFactory.decodeResource(context3.getResources(), 2131233934);
                                ExpandableMentionTextView expandableMentionTextView13 = fTCAwemeDraftViewHolder.f139551a;
                                if (expandableMentionTextView13 == null) {
                                    l.a("mAwemeTitle");
                                    l.b();
                                }
                                expandableMentionTextView13.a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), cVar2);
                            }
                        }
                    }
                }
                ExpandableMentionTextView expandableMentionTextView14 = fTCAwemeDraftViewHolder.f139551a;
                if (expandableMentionTextView14 == null) {
                    l.a("mAwemeTitle");
                    l.b();
                }
                expandableMentionTextView14.setTextColor(androidx.core.content.b.c(fTCAwemeDraftViewHolder.p, R.color.bx));
            }
            com.ss.android.ugc.aweme.draft.model.a aVar8 = cVar.f83181b;
            l.b(aVar8, "");
            List<AVChallenge> list = aVar8.f83163c;
            StringBuilder sb = new StringBuilder();
            if (list != null && list.size() > 0) {
                Iterator<AVChallenge> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AVChallenge next = it.next();
                    if (next.getChallengeName() == null) {
                        sb = new StringBuilder();
                        break;
                    }
                    sb.append(next.getChallengeName()).append(" ");
                }
            }
            String sb2 = sb.toString();
            l.b(sb2, "");
            if (m.a(sb2)) {
                TextView textView2 = fTCAwemeDraftViewHolder.f139554d;
                if (textView2 == null) {
                    l.a("mAwemeChallenge");
                }
                textView2.setText(R.string.bck);
                ImageView imageView3 = fTCAwemeDraftViewHolder.f139555e;
                if (imageView3 == null) {
                    l.a("mChallengeIcon");
                }
                imageView3.setImageResource(2131232265);
                TextView textView3 = fTCAwemeDraftViewHolder.f139554d;
                if (textView3 == null) {
                    l.a("mAwemeChallenge");
                }
                textView3.setTextColor(androidx.core.content.b.c(fTCAwemeDraftViewHolder.p, R.color.nu));
            } else {
                TextView textView4 = fTCAwemeDraftViewHolder.f139554d;
                if (textView4 == null) {
                    l.a("mAwemeChallenge");
                }
                textView4.setText(sb2);
                TextView textView5 = fTCAwemeDraftViewHolder.f139554d;
                if (textView5 == null) {
                    l.a("mAwemeChallenge");
                }
                textView5.setTextColor(androidx.core.content.b.c(fTCAwemeDraftViewHolder.p, R.color.re));
                ImageView imageView4 = fTCAwemeDraftViewHolder.f139555e;
                if (imageView4 == null) {
                    l.a("mChallengeIcon");
                }
                imageView4.setImageResource(2131232263);
            }
            TextView textView6 = fTCAwemeDraftViewHolder.f139554d;
            if (textView6 == null) {
                l.a("mAwemeChallenge");
            }
            textView6.setVisibility(8);
            ImageView imageView5 = fTCAwemeDraftViewHolder.f139555e;
            if (imageView5 == null) {
                l.a("mChallengeIcon");
            }
            imageView5.setVisibility(8);
            Space space = fTCAwemeDraftViewHolder.f139561k;
            if (space == null) {
                l.a("mDraftListSpaceBottom");
            }
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            RelativeLayout relativeLayout = fTCAwemeDraftViewHolder.f139562l;
            if (relativeLayout == null) {
                l.a("mDraftListItemLayout");
                l.b();
            }
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            int b2 = (int) n.b(fTCAwemeDraftViewHolder.p, 16.0f);
            int b3 = (int) n.b(fTCAwemeDraftViewHolder.p, 96.0f);
            if (!cVar.z) {
                View view = fTCAwemeDraftViewHolder.f139557g;
                if (view == null) {
                    l.a("mContentDivider1");
                }
                view.setVisibility(4);
                layoutParams.height = 0;
                layoutParams2.height = b3 - b2;
            } else {
                View view2 = fTCAwemeDraftViewHolder.f139557g;
                if (view2 == null) {
                    l.a("mContentDivider1");
                }
                view2.setVisibility(0);
                layoutParams.height = b2;
                layoutParams2.height = b3;
            }
            Space space2 = fTCAwemeDraftViewHolder.f139561k;
            if (space2 == null) {
                l.a("mDraftListSpaceBottom");
            }
            space2.setLayoutParams(layoutParams);
            RelativeLayout relativeLayout2 = fTCAwemeDraftViewHolder.f139562l;
            if (relativeLayout2 == null) {
                l.a("mDraftListItemLayout");
            }
            relativeLayout2.setLayoutParams(layoutParams2);
            MethodCollector.o(1666);
        } else if (viewHolder instanceof f) {
            f fVar = (f) viewHolder;
            fVar.f139600c = this.f139585a;
            com.ss.android.ugc.aweme.draft.model.c cVar3 = (com.ss.android.ugc.aweme.draft.model.c) this.f150019f.get(i2);
            if (cVar3 == null || cVar3.f83185f == null) {
                MethodCollector.o(1666);
                return;
            }
            fVar.t = cVar3;
            if (fVar.f139602e) {
                TextView textView7 = fVar.f139599b;
                if (textView7 == null) {
                    l.a("mNext");
                }
                textView7.setVisibility(4);
            } else if (fVar.f139600c) {
                TextView textView8 = fVar.f139599b;
                if (textView8 == null) {
                    l.a("mNext");
                }
                textView8.setVisibility(4);
            } else {
                TextView textView9 = fVar.f139599b;
                if (textView9 == null) {
                    l.a("mNext");
                }
                textView9.setVisibility(0);
            }
            TextView textView10 = fVar.f139598a;
            if (textView10 == null) {
                l.a("mMusicName");
            }
            com.ss.android.ugc.aweme.shortvideo.c cVar4 = cVar3.f83185f;
            l.b(cVar4, "");
            textView10.setText(cVar4.getName());
            TextView textView11 = fVar.f139599b;
            if (textView11 == null) {
                l.a("mNext");
            }
            textView11.setOnClickListener(new f.b(fVar, cVar3));
            MethodCollector.o(1666);
        } else {
            if (viewHolder instanceof c) {
                c cVar5 = (c) viewHolder;
                Object obj4 = this.f150019f.get(i2);
                l.b(obj4, "");
                int i3 = ((com.ss.android.ugc.aweme.draft.model.c) obj4).B;
                if (cVar5.f139578a == null || i3 < 0) {
                    MethodCollector.o(1666);
                    return;
                }
                cVar5.f139578a.setText(i3);
            }
            MethodCollector.o(1666);
        }
    }
}
