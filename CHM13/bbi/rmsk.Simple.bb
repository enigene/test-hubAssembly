��   �      �      �        0              @  H                                                                                                                                                                                                                                                      table repeatMasker
"RepeatMasker .out record"
    (
    string chrom;    "Genomic sequence name"
    uint chromStart;     "Start in genomic sequence"
    uint chromEnd;       "End in genomic sequence"
    string name;     "Name of repeat"
    uint score;       "always 0 place holder"
    char[1] strand;     "Relative orientation + or -"
    uint swScore;       "Smith Waterman alignment score"
    uint milliDiv;      "Base mismatches in parts per thousand"
    uint milliDel;      "Bases deleted in parts per thousand"
    uint milliIns;      "Bases inserted in parts per thousand"
    int  genoLeft;      "-#bases after match in genomic sequence"
    string repClass;    "Class of repeat"
    string repFamily;   "Family of repeat"
    int repStart;       "Start (if strand is +) or -#bases after match (if strand is -) in repeat sequence"
    uint repEnd;        "End in repeat sequence"
    int repLeft;        "-#bases after match (if strand is +) or start (if strand is -) in repeat sequence"
    )
                                         @                                                               ���x                                   �h$                           �             ��