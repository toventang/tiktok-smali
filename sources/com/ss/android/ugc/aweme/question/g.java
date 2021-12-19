package com.ss.android.ugc.aweme.question;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import java.lang.ref.WeakReference;
import java.util.List;

public final class g extends s.d {
    public static final a Companion = new a((byte) 0);
    private WeakReference<e> activity;
    private c question;
    private String source;
    private Aweme toJumpAweme;

    static {
        Covode.recordClassIndex(77932);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final boolean sendCustomRequest(com.ss.android.ugc.aweme.common.e.b<? extends com.ss.android.ugc.aweme.common.e.a<?, ?>> bVar, int i2) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77933);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final WeakReference<e> getActivity() {
        return this.activity;
    }

    public final c getQuestion() {
        return this.question;
    }

    public final String getSource() {
        return this.source;
    }

    public final Aweme getToJumpAweme() {
        return this.toJumpAweme;
    }

    public static final class b extends com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.question.e.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f119974a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f119975b;

        static {
            Covode.recordClassIndex(77934);
        }

        @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
        public final void c() {
            c question;
            String str;
            String str2;
            com.ss.android.ugc.aweme.question.e.a aVar;
            List<Aweme> a2;
            Aweme aweme;
            Aweme video;
            List<Aweme> a3;
            Aweme aweme2;
            if (this.f76396h != null && this.f76397i != null) {
                com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
                l.b(bVar, "");
                int i2 = ((com.ss.android.ugc.aweme.common.e.a) bVar).mListQueryType;
                boolean z = false;
                if (i2 == 1) {
                    com.ss.android.ugc.aweme.common.b bVar2 = this.f76396h;
                    l.b(bVar2, "");
                    if (((com.ss.android.ugc.aweme.common.e.a) bVar2).isDataEmpty()) {
                        com.ss.android.ugc.aweme.common.b bVar3 = this.f76396h;
                        l.b(bVar3, "");
                        List<Aweme> a4 = ((com.ss.android.ugc.aweme.question.e.a) bVar3).a();
                        com.ss.android.ugc.aweme.common.b bVar4 = this.f76396h;
                        l.b(bVar4, "");
                        ((c) this.f76397i).a(a4, ((com.ss.android.ugc.aweme.common.e.a) bVar4).isHasMore());
                        ((c) this.f76397i).f();
                        return;
                    }
                    c question2 = this.f119974a.getQuestion();
                    String str3 = null;
                    if (!(question2 == null || question2.getVideo() == null || (question = this.f119974a.getQuestion()) == null || question.getCreator() == null)) {
                        com.ss.android.ugc.aweme.question.e.a aVar2 = (com.ss.android.ugc.aweme.question.e.a) this.f76396h;
                        if (aVar2 == null || (a3 = aVar2.a()) == null || (aweme2 = a3.get(0)) == null) {
                            str = null;
                        } else {
                            str = aweme2.getAid();
                        }
                        c question3 = this.f119974a.getQuestion();
                        if (question3 == null || (video = question3.getVideo()) == null) {
                            str2 = null;
                        } else {
                            str2 = video.getAid();
                        }
                        if (!(!l.a((Object) str, (Object) str2) || (aVar = (com.ss.android.ugc.aweme.question.e.a) this.f76396h) == null || (a2 = aVar.a()) == null || (aweme = a2.get(0)) == null)) {
                            e eVar = this.f119975b;
                            if (eVar != null) {
                                str3 = eVar.getString(R.string.dnm);
                            }
                            aweme.setLabelMusicStarterText(str3);
                        }
                    }
                    com.ss.android.ugc.aweme.common.b bVar5 = this.f76396h;
                    l.b(bVar5, "");
                    List<Aweme> a5 = ((com.ss.android.ugc.aweme.question.e.a) bVar5).a();
                    com.ss.android.ugc.aweme.common.b bVar6 = this.f76396h;
                    l.b(bVar6, "");
                    ((c) this.f76397i).a(a5, ((com.ss.android.ugc.aweme.common.e.a) bVar6).isHasMore());
                } else if (i2 == 2) {
                    com.ss.android.ugc.aweme.common.b bVar7 = this.f76396h;
                    l.b(bVar7, "");
                    List<Aweme> a6 = ((com.ss.android.ugc.aweme.question.e.a) bVar7).a();
                    com.ss.android.ugc.aweme.common.b bVar8 = this.f76396h;
                    l.b(bVar8, "");
                    ((c) this.f76397i).c(a6, !((com.ss.android.ugc.aweme.common.e.a) bVar8).isNewDataEmpty());
                } else if (i2 == 4) {
                    c cVar = (c) this.f76397i;
                    com.ss.android.ugc.aweme.common.b bVar9 = this.f76396h;
                    l.b(bVar9, "");
                    List<Aweme> a7 = ((com.ss.android.ugc.aweme.question.e.a) bVar9).a();
                    com.ss.android.ugc.aweme.common.b bVar10 = this.f76396h;
                    l.b(bVar10, "");
                    if (((com.ss.android.ugc.aweme.common.e.a) bVar10).isHasMore()) {
                        com.ss.android.ugc.aweme.common.b bVar11 = this.f76396h;
                        l.b(bVar11, "");
                        if (!((com.ss.android.ugc.aweme.common.e.a) bVar11).isNewDataEmpty()) {
                            z = true;
                        }
                    }
                    cVar.b(a7, z);
                }
            }
        }

        b(g gVar, e eVar) {
            this.f119974a = gVar;
            this.f119975b = eVar;
        }
    }

    public final void setActivity(WeakReference<e> weakReference) {
        this.activity = weakReference;
    }

    public final void setQuestion(c cVar) {
        this.question = cVar;
    }

    public final void setToJumpAweme(Aweme aweme) {
        this.toJumpAweme = aweme;
    }

    public final void setSource(String str) {
        l.d(str, "");
        this.source = str;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b, com.ss.android.ugc.aweme.challenge.ui.s.d
    public final void onJumpToDetail(String str) {
        l.d(str, "");
        super.onJumpToDetail(str);
    }

    public g(c cVar, String str) {
        l.d(str, "");
        this.question = cVar;
        this.source = str;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.d
    public final int getDetailAwemeViewType(int i2, Aweme aweme) {
        if (aweme == null || aweme.getNewLiveRoomData() == null) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final s.c getJumpToVideoParam(s.c cVar, Aweme aweme) {
        l.d(cVar, "");
        l.d(aweme, "");
        this.toJumpAweme = aweme;
        cVar.f70216a = "qa_detail";
        cVar.f70217b = "question_id";
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final com.ss.android.ugc.aweme.common.e.b<? extends com.ss.android.ugc.aweme.common.e.a<?, ?>> getPresenter(int i2, e eVar) {
        com.ss.android.ugc.aweme.question.e.a aVar = new com.ss.android.ugc.aweme.question.e.a();
        if (eVar != null) {
            QuestionDetailViewModel a2 = QuestionDetailViewModel.a.a(eVar);
            l.d(aVar, "");
            a2.f120015b.setValue(new p<>(Integer.valueOf(i2), aVar));
        }
        aVar.f119953b.f119963d = this.question;
        String str = this.source;
        if (!TextUtils.isEmpty(str)) {
            aVar.f119952a = str;
        }
        b bVar = new b(this, eVar);
        bVar.a((com.ss.android.ugc.aweme.common.b) aVar);
        return bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(c cVar, String str, int i2, h.f.b.g gVar) {
        this(cVar, (i2 & 2) != 0 ? "" : str);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.d
    public final com.ss.android.ugc.aweme.challenge.a.a onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i2, String str, d dVar) {
        l.d(viewGroup, "");
        return new h(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.w5, viewGroup, false), str, dVar);
    }
}
