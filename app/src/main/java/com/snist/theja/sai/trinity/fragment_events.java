package com.snist.theja.sai.trinity;

/**
 * Created by sai on 07-01-2016.
 */

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class fragment_events extends Fragment {

    public fragment_events(){}
    View rootView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.layout_event, container, false);
        ExpandableListView elv = (ExpandableListView) rootView.findViewById(R.id.list);
        Button but = (Button) rootView.findViewById(R.id.button1);
        elv.setAdapter(new SavedTabsListAdapter());
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View rootView) {

                Fragment frag = new fragment_events_online();


                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return rootView;
    }




    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "\t\t\t\tADASTRA", "\t\t\t\tROBOVEDA", "\t\t\t\tRIGOLADE",
                "\t\t\t\tWORKSHOPS"
        };

        private String[][] children = {
                { "\n\t\t\t\t1.\tTECH INFERNO\n" +
                        "\t\ti.\tPAPER PRESENTATIONS\n" +
                        "\t\tii.\tPOSTER PRESENTATIONS\n" +
                        "\t\tiii.\tPROJECT EXPO\n" +
                        "\t\tiv.\tCASE STUDIES\n" +
                        "\t\tv.\tCOMPUTER CHAMPS\n" +
                        "\t\tvi.\tMECH MANIACS\n" +
                        "\t\tvii.\tELECTRO BUZZ\n" +
                        "\t\tviii.\tBIO-BLAST\n",

                        "\n\t\t\t\t2.\tMANAGEMENT\t\n" +
                                "\t\ti.\tCORPORATE CRUNCH\n" +
                                "\t\tii.\tOptimize\n" +
                                "\t\tiii.\tB – Quiz\n" +
                                "\t\tiv.\tInterview Simulator\n",

                        "\n\t\t\t\t3.\tNON TECHNICAL – PANDEMONIUM\n" +
                                "\t\ti.\tMr & Ms ADASTRA\n" +
                                "\t\tii.\tRADIUM CRICKET\n" +
                                "\t\tiii.\tSHORT PITCH CRICKET\n" +
                                "\t\tiv.\tTREASURE HUNT\n" +
                                "\t\tv.\tTUG OF WAR\n" +
                                "\t\tvi.\tGULLY CRICKET\n" +
                                "\t\tvii.\tMUSIC MASTERO\n" +
                                "\t\tviii.\tSELFIE/GROUPFIE OF THE DAY\n",

                        "\n\t\t\t\t4.\tCODE BUSTERS\n" +
                                "\t\ti.\tThe C - Challenge\n" +
                                "\t\tii.\tJAVA GENIUS\n" +
                                "\t\tiii.\tOOPS Quiz\n" +
                                "\t\tiv.\tWeb Masters\n" +
                                "\t\tv.\tE – Query\n" +
                                "\t\tvi.\tCache Hunt\n",

                        "\n\t\t\t\t5.\tGAMING\t\t\t\t \n" +
                                "\t\ti.\tSuper MARIO\n" +
                                "\t\tii.\tSuper CONTRA\n" +
                                "\t\tiii.\tCOUNTER STRIKE\n" +
                                "\t\tiv.\tNFS Most Wanted\n" +
                                "\t\tv.\tFIFA 09\n",
                "\n\t\t\t\t6.\tELECTRONICS\n" +
                        "\t\ti.\tDTMF Race\n" +
                        "\t\tii.\tCircuit Debug\n" +
                        "\t\tiii.\tE – Treasure Hunt\n",

                        "\n\t\t\t\t7.\tENTREPRENEURSHIP()\n" +
                                "\t\ti.Startup Quiz\t\n" +
                                "\t\tii.Idea|Business Idea Pitching\n"

                },



                {
                        "\t\t\t\ta.\tSARVAGAAMI\t\t-\tAll Terrain Robotic Event\n" ,
                        "\t\t\t\tb.\tGATI\t\t\t-\tRobotic Race\n" ,
                        "\t\t\t\tc.\tGOLAA\t\t\t-\tRobo Soccer\n" ,
                        "\t\t\t\td.\tDRISHTI\t\t-\tImage Processing Robot\n" ,
                        "\t\t\t\te.\tVIDYUTHEEN\t\t-\tMechanically Driven Robot\n" ,
                        "\t\t\t\tf.\tNIYANTRANA\t\t-\tGesture Controlled Robot\n" ,
                        "\t\t\t\tg.\tVISTAAR\t\t-\tRobotic Arm\n" ,
                        "\t\t\t\th.\tLAKSHMANA REKHA\t-\tLine Follower\n" ,
                        "\t\t\t\ti.\tSAMVIDITHA\t\t-\tMetal Detector Robot\n" ,
                        "\t\t\t\tj.\tPRAVAYAANA\t\t-\tHover Craft Robot\n" ,
                        "\t\t\t\tk.\tPARISHKAR\t\t-\tSolutions for Society\n" ,
                        "\t\t\t\tl.\tYODHA\t\t-\tSumo Wars\n" ,
                        "\t\t\t\tm.\tJALADHMATRA\t-\tWater Rover\n" ,
                        "\t\t\t\tn.\tRANAVEERA\t\t-\tRobo Wars\n","\n\t"
                        },
                { "\n\t\ta.\tABHINAYA\n" +
                        "i.\tPhotography Contest\n" +
                        "ii.\tShort Film Contest\n" +
                        "iii.\tDeclamation\n" +
                        "iv.\tDramatics\n",

                        "\n\t\tb.\tKALAKRITI\n" +
                                "i.\tSpray Painting\n" +
                                "ii.\tNail Art & Mehendi\n" +
                                "iii.\tMagazine Cut Out Art\n" +
                                "iv.\tPainting Competition\n",

                        "\n\t\tc.\tNRITYA\n" +
                                "i.\tDance (Solos and Groups) (Free style and classical)\n" +
                                "ii.\tBreak Free! (Foot Loose)\n",

                        "\n\t\td.\tSAHITI\n" +
                                "i.\tJournalistic Fair\n" +
                                "ii.\tLogger Heads\n" +
                                "iii.\tCreative Writing\n" +
                                "iv.\tVirtual Parliament\n",

                        "\n\t\te.\tSARGAM\n" +
                                "i.\tSinging (Solos and Duos) (Free style and Classical)\n" +
                                "ii.\tBattle of Bands (Band Wars)\n" +
                                "iii.\tFace of RAP\n" +
                                "iv.\tBeat Box\n"
                        },
                { "\n\t\ti.\tEmergency Lamp Workshop\n" +
                        "ii.\tCyber Forensics Workshop\n" +
                        "iii.\tAutospark - Vehicle Overhauling Workshop\n" +
                        "iv.\tMIcromouse Workshop\n"},

        };


        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            float k=23;
            TextView textView = new TextView(fragment_events.this.getActivity());
            textView.setText(getGroup(i).toString());
            textView.setTextSize(k);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            float k=19;
            TextView textView = new TextView(fragment_events.this.getActivity());
            textView.setText(getChild(i, i1).toString());
            textView.setTextSize(k);
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }

    }
}

