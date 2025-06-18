package com.berthaudiere.berthau;

import java.util.Arrays;
import java.util.List;

import com.berthaudiere.berthau.web.sheet.ActivitySheet;

public class ActivitySheetList {
    public static ActivitySheet COLLIN_MAILLARD = new ActivitySheet(
            1,
            "Collin-maillard",
            12,
            "favoriser le vivre ensemble",
            "Le joueur est bandé les yeux et tourne sur lui-même pendant que les autres joueurs se déplacent autour de lui en silence. Le joueur aveugle doit alors essayer de toucher l'un des joueurs en se basant uniquement sur le son qu'il entend. Si le joueur aveugle touche un joueur, celui-ci devient le nouveau ",
            " Un foulard ou un bandeau pour bander les yeux du joueur ");

    public static ActivitySheet JACQUES_A_DIT = new ActivitySheet(
            2,
            "Jacques a dit",
            10,
            "Améliorer la concentration",
            "L'animateur donne des consignes en disant ou non 'Jacques a dit'. Les joueurs doivent suivre uniquement celles qui commencent par 'Jacques a dit'.",
            "Aucun matériel nécessaire");

    public static ActivitySheet COURSE_EN_SAC = new ActivitySheet(
            3,
            "Course en sac",
            6,
            "Développer la motricité et l’esprit de compétition",
            "Les joueurs doivent faire la course en sautant dans des sacs. Le premier arrivé gagne. Peut être joué en relais ou en individuel.",
            "Sacs en toile ou sacs poubelle solides");

    public static ActivitySheet CHAISE_MUSICALE = new ActivitySheet(
            4,
            "Chaises musicales",
            8,
            "Stimuler la réactivité",
            "Les joueurs tournent autour de chaises pendant que la musique joue. Quand elle s’arrête, ils doivent s’asseoir. Il y a une chaise de moins que de joueurs. Celui qui reste debout est éliminé.",
            "Chaises et musique (enceinte, téléphone, etc.)");

    public static ActivitySheet DESSIN_MYSTERE = new ActivitySheet(
            5,
            "Dessin mystère",
            5,
            "Encourager la créativité et la coopération",
            "Par groupes de 2, un enfant décrit une image sans la montrer, l’autre doit la dessiner le plus fidèlement possible sans la voir.",
            "Feuilles, crayons, images simples à décrire");

    public static final List<ActivitySheet> ALL = Arrays.asList(COLLIN_MAILLARD, JACQUES_A_DIT, COURSE_EN_SAC, CHAISE_MUSICALE, DESSIN_MYSTERE);        
}
