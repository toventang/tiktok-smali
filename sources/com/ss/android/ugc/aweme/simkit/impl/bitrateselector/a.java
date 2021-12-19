package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

final class a {

    static class c {
        static {
            Covode.recordClassIndex(87343);
        }
    }

    static class g {
        static {
            Covode.recordClassIndex(87352);
        }
    }

    static {
        Covode.recordClassIndex(87339);
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$a  reason: collision with other inner class name */
    static class C3460a {
        static {
            Covode.recordClassIndex(87340);
        }

        static com.ss.android.ugc.aweme.bitrateselector.a.a.a a(final com.ss.android.ugc.f.a.a.a.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new com.ss.android.ugc.aweme.bitrateselector.a.a.a() {
                /* class com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.C3460a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(87341);
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.a
                public final double a() {
                    return aVar.a();
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.a
                public final double b() {
                    return aVar.b();
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.a
                public final double c() {
                    return aVar.c();
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.a
                public final double d() {
                    return aVar.d();
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.a
                public final double e() {
                    return aVar.e();
                }
            };
        }
    }

    static class d {
        static {
            Covode.recordClassIndex(87345);
        }

        static com.ss.android.ugc.f.a.a.a.a.c a(final com.ss.android.ugc.aweme.bitrateselector.a.a.c cVar) {
            if (cVar == null) {
                return null;
            }
            return new com.ss.android.ugc.f.a.a.a.a.c() {
                /* class com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(87346);
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.c
                public final int getBitRate() {
                    return cVar.a();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.c
                public final String getChecksum() {
                    return cVar.g();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.c
                public final String getGearName() {
                    return cVar.b();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.c
                public final int getQualityType() {
                    return cVar.c();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.c
                public final int getSize() {
                    return cVar.h();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.c
                public final String getUrlKey() {
                    return cVar.e();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.c
                public final int isBytevc1() {
                    return cVar.d();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.c
                public final List<String> urlList() {
                    return cVar.f();
                }

                public final String toString() {
                    return "BitRate{bitRate=" + cVar.a() + ", gearName='" + cVar.b() + '\'' + ", qualityType=" + cVar.c() + ", isBytevc1=" + cVar.d() + '}';
                }
            };
        }
    }

    static class f {
        static {
            Covode.recordClassIndex(87350);
        }

        static com.ss.android.ugc.aweme.bitrateselector.a.a.d a(final com.ss.android.ugc.f.a.a.a.a.d dVar) {
            if (dVar == null) {
                return null;
            }
            return new com.ss.android.ugc.aweme.bitrateselector.a.a.d() {
                /* class com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(87351);
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.d
                public final String a() {
                    return dVar.a();
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.d
                public final Set<String> b() {
                    return dVar.b();
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.d
                public final double c() {
                    return dVar.c();
                }

                @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.d
                public final Pair<Double, Double> d() {
                    return dVar.d();
                }
            };
        }
    }

    static class b {
        static {
            Covode.recordClassIndex(87342);
        }

        static List<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.b> a(List<? extends com.ss.android.ugc.f.a.a.a.a.b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.ugc.f.a.a.a.a.b bVar : list) {
                arrayList.add(bVar == null ? null : new com.ss.android.ugc.aweme.bitrateselector.a.a.b(bVar) {
                    /* class com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.ugc.f.a.a.a.a.b f133526a;

                    static {
                        Covode.recordClassIndex(87344);
                    }

                    @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.b
                    public final double a() {
                        return this.f133526a.getSpeed();
                    }

                    @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.b
                    public final double b() {
                        return this.f133526a.getBitrate();
                    }

                    {
                        this.f133526a = r1;
                    }
                });
            }
            return arrayList;
        }
    }

    static class e {
        static {
            Covode.recordClassIndex(87348);
        }

        static List<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.c> a(List<com.ss.android.ugc.playerkit.simapicommon.a.e> list) {
            if (list == null || list.size() == 0) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (final com.ss.android.ugc.playerkit.simapicommon.a.e eVar : list) {
                if (eVar != null) {
                    arrayList.add(new com.ss.android.ugc.aweme.bitrateselector.a.a.c() {
                        /* class com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.e.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(87349);
                        }

                        @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.c
                        public final int a() {
                            return eVar.getBitRate();
                        }

                        @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.c
                        public final String b() {
                            return eVar.getGearName();
                        }

                        @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.c
                        public final int c() {
                            return eVar.getQualityType();
                        }

                        @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.c
                        public final int d() {
                            return eVar.isBytevc1();
                        }

                        @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.c
                        public final String e() {
                            return eVar.getUrlKey();
                        }

                        @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.c
                        public final List<String> f() {
                            return eVar.urlList();
                        }

                        @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.c
                        public final String g() {
                            return eVar.getChecksum();
                        }

                        @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.c
                        public final int h() {
                            return eVar.getSize();
                        }

                        public final String toString() {
                            return "BitRate{bitRate=" + eVar.getBitRate() + ", gearName='" + eVar.getGearName() + '\'' + ", qualityType=" + eVar.getQualityType() + ", isBytevc1=" + eVar.isBytevc1() + '}';
                        }
                    });
                }
            }
            return arrayList;
        }
    }

    static class h {
        static {
            Covode.recordClassIndex(87354);
        }

        static List<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.e> a(List<? extends com.ss.android.ugc.f.a.a.a.a.e> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.ugc.f.a.a.a.a.e eVar : list) {
                arrayList.add(eVar == null ? null : new com.ss.android.ugc.aweme.bitrateselector.a.a.e(eVar) {
                    /* class com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.ugc.f.a.a.a.a.e f133531a;

                    static {
                        Covode.recordClassIndex(87353);
                    }

                    @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.e
                    public final int a() {
                        return this.f133531a.getNetworkUpper();
                    }

                    @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.e
                    public final int b() {
                        return this.f133531a.getNetworkLower();
                    }

                    @Override // com.ss.android.ugc.aweme.bitrateselector.a.a.e
                    public final int c() {
                        return this.f133531a.getBitRate();
                    }

                    {
                        this.f133531a = r1;
                    }
                });
            }
            return arrayList;
        }
    }
}
