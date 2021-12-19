package com.ss.android.ugc.aweme.search.viewmodel;

import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.discover.a.aj;
import com.ss.android.ugc.aweme.discover.a.al;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.model.TrendingData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.k.n;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class SuggestWordsViewModel extends ac {

    /* renamed from: e  reason: collision with root package name */
    public static final String f121749e = "key_raw_guess_words";

    /* renamed from: f  reason: collision with root package name */
    public static final String f121750f = "SuggestWordsViewModel";

    /* renamed from: g  reason: collision with root package name */
    public static final String f121751g = "key_middle_guess_list";

    /* renamed from: h  reason: collision with root package name */
    public static final a f121752h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.discover.api.a.a<List<TypeWords>>> f121753a = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Word> f121754b = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.discover.api.a.a<String>> f121755c = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.discover.api.a.a<TrendingData>> f121756d = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();

    public static final class a {
        static {
            Covode.recordClassIndex(79299);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static SuggestWordsViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(SuggestWordsViewModel.class);
            l.b(a2, "");
            return (SuggestWordsViewModel) a2;
        }
    }

    public final void a() {
        SuggestWordsApi.b().a(new d(this), i.f4826c, null);
    }

    static {
        Covode.recordClassIndex(79298);
    }

    static final class d<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SuggestWordsViewModel f121759a;

        static {
            Covode.recordClassIndex(79302);
        }

        d(SuggestWordsViewModel suggestWordsViewModel) {
            this.f121759a = suggestWordsViewModel;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            if (iVar.a()) {
                ArrayList<com.ss.android.ugc.aweme.search.l> arrayList = ((TrendingData) iVar.d()).billboardInfo;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f121759a.f121756d.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>((TrendingData) iVar.d()));
                }
            } else if (iVar.c()) {
                this.f121759a.f121756d.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(iVar.e()));
            }
            return z.f158842a;
        }
    }

    public static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SuggestWordsViewModel f121757a;

        static {
            Covode.recordClassIndex(79300);
        }

        public b(SuggestWordsViewModel suggestWordsViewModel) {
            this.f121757a = suggestWordsViewModel;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            List<TypeWords> list;
            Object obj;
            Word word;
            l.b(iVar, "");
            if (iVar.a()) {
                SuggestWordResponse suggestWordResponse = (SuggestWordResponse) iVar.d();
                ArrayList arrayList = new ArrayList();
                if (!(suggestWordResponse == null || (list = suggestWordResponse.data) == null)) {
                    for (T t : list) {
                        String str = suggestWordResponse.logId;
                        if (str == null) {
                            str = "";
                        }
                        t.setImprId(str);
                        List<Word> list2 = t.words;
                        if (list2 != null && (!list2.isEmpty()) && al.f80155a) {
                            List<Word> list3 = t.words;
                            if (!(list3 == null || (word = (Word) n.h((List) list3)) == null)) {
                                String str2 = suggestWordResponse.logId;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                word.setImplId(str2);
                            }
                            t tVar = this.f121757a.f121754b;
                            List<Word> list4 = t.words;
                            if (list4 == null || (obj = n.h((List) list4)) == null) {
                                obj = new Word();
                            }
                            tVar.setValue(obj);
                        }
                        List<Word> list5 = t.words;
                        if (list5 == null || !(!list5.isEmpty()) || !al.f80155a) {
                            List<VisitedAccount> list6 = t.visitedAccount;
                            if (list6 != null && (!list6.isEmpty()) && aj.f80151a) {
                                arrayList.add(t);
                            }
                        } else {
                            arrayList.add(t);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f121757a.f121753a.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(arrayList));
                    n.a.a(1);
                    n.a.a("native");
                } else {
                    this.f121757a.f121753a.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(iVar.e()));
                }
            } else if (iVar.c()) {
                this.f121757a.f121753a.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(iVar.e()));
            }
            return z.f158842a;
        }
    }

    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SuggestWordsViewModel f121758a;

        static {
            Covode.recordClassIndex(79301);
        }

        public c(SuggestWordsViewModel suggestWordsViewModel) {
            this.f121758a = suggestWordsViewModel;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            TypeWords typeWords;
            Word word;
            Word word2;
            List<TypeWords> list;
            String str = "";
            l.b(iVar, str);
            if (iVar.a()) {
                String str2 = (String) iVar.d();
                if (!TextUtils.isEmpty(str2)) {
                    this.f121758a.f121755c.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(str2));
                    try {
                        SuggestWordResponse suggestWordResponse = (SuggestWordResponse) new f().a(str2, SuggestWordResponse.class);
                        List<Word> list2 = null;
                        if (suggestWordResponse == null || (list = suggestWordResponse.data) == null) {
                            typeWords = null;
                        } else {
                            typeWords = (TypeWords) h.a.n.h((List) list);
                        }
                        if (typeWords != null) {
                            list2 = typeWords.words;
                        }
                        if (list2 != null) {
                            List<Word> list3 = typeWords.words;
                            if (list3 == null) {
                                l.b();
                            }
                            if (!list3.isEmpty()) {
                                List<Word> list4 = typeWords.words;
                                if (!(list4 == null || (word2 = (Word) h.a.n.h((List) list4)) == null)) {
                                    String str3 = suggestWordResponse.logId;
                                    if (str3 != null) {
                                        str = str3;
                                    }
                                    word2.setImplId(str);
                                }
                                com.ss.android.ugc.aweme.arch.widgets.base.c<Word> cVar = this.f121758a.f121754b;
                                List<Word> list5 = typeWords.words;
                                if (list5 == null || (word = (Word) h.a.n.h((List) list5)) == null) {
                                    word = new Word();
                                }
                                cVar.setValue(word);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    this.f121758a.f121755c.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(iVar.e()));
                }
            } else if (iVar.c()) {
                this.f121758a.f121755c.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(iVar.e()));
            }
            return z.f158842a;
        }
    }
}
