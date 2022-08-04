<?xml version="1.0" encoding="UTF-8"?>
<project-private xmlns="http://www.netbeans.org/ns/project-private/1">
    <editor-bookmarks xmlns="http://www.netbeans.org/ns/editor-bookmarks/2" lastBookmarkId="0"/>
    <open-files xmlns="http://www.netbeans.org/ns/projectui-open-files/2">
        <group>
            <file>file:/K:/numNumb/src/numnumb/s.java</file>
            <file>file:/K:/numNumb/src/numnumb/numNumb.java</file>
        </group>
    </open-files>
</project-private>
                               
            Point p1 = new Point(5, 10);
            Point p2 = new Point(10, 15);
            Point p3 = new Point(15, 20);
            drawSnowflake(g, 0, p1, p2, p3);
            
            Point pOne = new Point(25, 30);
            Point pTwo = new Point(30, 25);
            drawSegment(g, 0, pOne, pTwo);
            // a point is an x and y coordinate
            
        }

	public void init()
	{
		setSize(640, 480);
		String levelStr = JOptionPane.showInputDialog
                         ("Enter the recursion depth: ");
		level = Integer.parseInt(levelStr);
	}

	public void paint(Graphics g)
	{
		Point pointOne = new Point(120, 320);
		Point pointTwo = new Point(440, 320);	// reusing Points from example program * 2;
		Point pointThree = new Point(280, 40);

		drawSnowflake(g, level, pointOne, pointTwo, pointThree);
	}

	private void drawSnowflake(Graphics g, int lev,
                                Point p1, Point p2, Point p3)
	{
		drawSegment(g, lev, p1, p2);	// draw 3 lines to make a triangle
		drawSegment(g, lev, p2, p3);
		drawSegment(g, lev, p3, p1);
	}
	
	private void drawSegment(Graphics g, int lev, Point pOne, Point pTwo)
	{
		if (lev == 0)
		{
			g.drawLine(pOne.x, pOne.y, pTwo.x, pTwo.y);
			}
		if (lev >= 1){
			Point distance = new Point( (pTwo.x-pOne.x)/3, (pTwo.y-pOne.y)/3 );
         Point pA = new Point( pOne.x+distance.x, pOne.y+distance.y);
         Point pB = new Point( pTwo.x-distance.x, pTwo.y-distance.y);
			double sin60 = -0.866025403784438646763723170752936183471402626905190;
         Point pTip = new Point(
         	pA.x + (int)(distance.x* 0.5 + distance.y*sin60),
         	pA.y + (int)(distance.y* 0.5 - distance.x*sin60)
         );
		
			drawSegment(g, lev - 1, pOne, pA);	// if level 1 or higher,
			drawSegment(g, lev - 1, pA, pTip);	// recursively call self 4 times
			drawSegment(g, lev - 1, pTip, pB);	
			drawSegment(g, lev - 1, pB, pTwo);	
		}
	}
}                                                       �m:�ʦI��p�u����&-�T�p��C�Ⴋ���M;�sS?����t�\�|?���^���3�
�I_��ϻ W_u򋵫{��@ xQBҳ�"�!T������;�j���k���z��*�k�+�;AjN_D}�"49��{b���H�U�E#�q�t����#�� Q̡F$FIXG5���N�F��*n�;�$CMz=,��è:,it��!�WQ�Տ�H�?(͇��KR/_A�Q�n2�O2������؁�#mE�VT�1H�p�N�0,P�ߜ���4��Y��i���[i��k�3 u��G�8��v��Hv��y��6 s�_�d�2�Hq~�N�T3��﮳���
��>Yi�A����ue��)R�Mx����$�AF�9	��3��]�~�ސ��{�W�^?���rnl�ў����e���e����xXs=Έ��y��nn�͉i��.~��x,a����N�\�_��\���Ht�z����p֟rn��r	��v3��`Ӕ�k�:\p��6yW�5��:��u����h��a~���6I^Y��<�Ϲ������ü��0@�h�� ��|���2�Vd�k�l1N�N�}���m�9���n8���K���ƣ@ ��a�
lv�5`X>���' ӧȟ6S
�;��C����"�<��}L�40�TGo4��Q�픏�<n�|�pq��\)�+�����D����H��A���A���aY��PjH[�r�j}���z_1���hBY]�+��'B�W2��`z'I��"P읆H� ��,2U�G����"��G�\)����"��".R����,�#���~��!�ˉ��3f���"i�B�4�btݓ��o��욆�qm����t[q������	�<v�h0qF�&ֈ"������u��ޓp,�d�x��	��!4eI��a#͙���
�����3�$I�IWk���8	�r�w0u�}��_�'�h�F;��+pë��E�c��m�[�\�t)�0��.���,:W.�߾�c=�@`�>��V�٘;�z�ǽsCC^�U���N�ƕ�8����=�ɘ꘍s��7\|���lX�u�N��j�X�SN[�u-����	��C��\,�`m�}�b���^�C�;75D�zZ����<���@ {��z����}p;(��f��VU�z���^`֔2�N���3&���p��)8t�̙܋�%ӌ�1*M(�/Dix��ށBMa�|�ϰ|�.�*���H�h\*�"	�[(�[W�jd���zQʩaI>NW�"�~�/�z$�H�[B���
�H�*6aj}Q��7�^���H`Y*S�
��(�T�w@5xj'C:a�F4�P���x$��tuP�wdI]���qp|�Ol��rm���c*lG���[M�Y�z���\q��KO��@�����;��iW�>dkh�:� ��FkDr�*O��q����^�ğ�*u�=���£(��~�z�m=7UDәO$N��	�9-�@`߄����G��a��X��R\�g�9�B\�r	.�mD)�\���n<߆�5�=�E��f"�?�D�|xu�z��8������0���{1������̻a�:��	����ZϚ3u�0�d�
g�Y���9�Md��׮�w
u`�}X����3s�]����)=t��X�V{w]��(a�]����q��-^�	��H������q�� Q�rܒ,���w�]�m�%�]��[n�΋�@ �b�EwH>��k�ձ}`��? �?�������ѵ���L���æ�q��>=}
��1�L��#�Mġ*8H2O-T1�QńưJo}e�\LPI�-J�E�"|�x$�����b�ǋ)(��(���%T*E��D�HJR���]N%�D*}ETz�(��Q�~�&��^D{Q�Ф
�z��"40U(2�������q�Q�N$#҈t���P1F���$�_��N$c8����!�����P*���zNq��DiK�Fu��]!�x��:3E��l� c�E\C�ĥ�~/�;�i]��F!�7M���5�䇶�(��>�S�*�sG۱���/���7�����K'�(9tm/�ד��4�Ǘ$�0�d���S���d]T_FEF��ڎ�g���
�$�w��eL���#������	���j����E�����c�si9.���mDy���`�-7�%f�M�a�5o�QG�q�;OŽ������ڼ�hL�ϩf�S[6ܵ�Ļ��u�s���B:���{:w�U�Eߍd����`E�ʴK�i�X<��)��sy��\}�ݔe�J�{��D��L��]�us�)���@ ����if�K�AcR�!��:TW>����j�U�b�p���N�;�j��0�8x0wb�L.�)p��I8z�4̟1GL���}%L��Q��TCR���WBoc}�!�DOu =�L��Wz4A���'#L,0�R��r�+��#L-S���RCeR"z%�m&*�D*�TTi��,4���iB�'�L�B�eN&��b��z$��!e5vD�y�]T�,Ⴞ7��~���j4�a�̜��G�Q�,s�����`� "�u��8H��-�t��Y}��r��t������#;w��؟�Ƙ`�Nƈ�o���w��\���p'|��Dڨ�u�_��3�h�q�'|�X;їX�g�x'��<�|t��*��-a��Ѯ�N��v������|I���N������=Y�FZ�s,^Z�Z`þ0Η�e]I�:����-����h��pe]=�J�2����J��[�ߏb�[���sX�0V[o6�q��r_�^��Ϛ�/��n���Z�	cżh�ܫ�A����&'o�QGܭr3�NDN���a�c��ݿ��?~/��q����⒌z�{֭0;�V�y�.���J���vV��n���N0�e�`����#����Wa=��x;�;�+^ �~4�ʧ�P�p=��jC�E[���Cul�F�$��j;�u�SǮ����A��h �:&��]�N��68rj	�g��؃'�y3p⼃qĔ>��)bFc��va��NL�hxV���QRG	s����W�pp/0���D8���"�+�0���%L/70�PS�To����*"���J�6��ҹ�"S���
0Q*흀Be2�=��[��rq*���(���S�D,�]I<�/u����7��{�ʒ�0M��t7R�R�O4Ejx�Qw�rE꣑��;{:Q����*Կ+N�F��nK�⭸;*qv��,6^E����ͱ�d�������Ʋ�o�:ݡ�я��Ntw��ר`���=e���۴y겖)6Ѹ.��ב��p*>�uiyud^�4�㋇k�	���1l���a�cv�bvq�4�-ud��I��f�#�_�_��1����u�nݻ�"O�@sK�F�Xd��eX�6c��S1����`���h�2�ڍ1g��e�",��2||�J�\bvE�`��%Xp���;�Β>�N��	�@`lИ����1'k�Mvޖ#����ƣ�lx,�Tb�r�����9|�L�w�ު��b]Ӏ��r.��&����do��@`�G?��SjI��z��ZD�`�QĮF;���*e���.��K)�N)5 �CU`��N��w(��F�I���� 4wp��N�׋����9/�3GM���J�����:�!	C�^��=C�9K�9�$uI{ӥ��A�wnp��{���Y���zq��
fO*b��M��1YdR����0ʕ��H*L,�4y*�'�<i2��>�+}(N�.�3%}
�SP��K��TV)Ӑ4�R/�ܙ�F4 ��T����3^w/�{P�P,�#s��!ƈA���C�J�S��U�]3�on^�;�`�~��l:܁��D����6�;��}B/�>���O�s��@Y2{y�k���I��)�n���<�-q����Ӎ��Z�����h���G+9��?�H�:q��i7�?�=N��5�ߺ�x��(�z��f>��ХX����z\���Ư-Z�ۗ�Ģ�čR_�{i�R,Z�����E�n���||	p���s��?8/t��;q[����7yyg�ż{�1���:�v$�xԑ������{��t������j�s��m7����2{��Աu�e���݅Y�b����N�O��3�ѵ�@�E?��㩾����K��[mT0\/a�Z@�P����֡��ְ�>����x�VǦZ�kUl�c�P�W�6P�{��@4�k<�R &J܌H�� GLL-b��>�	X0�GL(�ОsKu,�n����f�̠a)���0�P�T����,��C'�H�GM�0zf��i}8|R	��
�Y�cZ0����^�Z׃��c��gL���)�<�"��R{�d�W*�!�,���Hz��N@�L�JQ(�t�w-�񨂂|�/T�>%�>*�F$j��w^�M}�w�h����$���;�ra�[p�r�0���7����v��]�2�HƜ!��8�C��F]�ѭ]iޗ���Ǎ���Z�@�};��e�{�f��ɗ$�Tj����i�?^�hGH���r�&/~��u���n��d$�4����/�����uӉ�ƈ�5�G�tz���y7���������z����\�,9q�nwn��+p�
`��_���s7�z�@G������r�]2w����eW]ܤq|�Uj �:rYx1�>�^\k�	���8�\6`�ڹ�3�.<�;�ǽ���B\|��m�6�QǳM�u7���.���X�����|7���v�j7���*ߣ�Ϥ�Y�W��/�&n�V���[jul�5���c�jxA�[�c-w'm�;�v�����u�00P��ٝ�+��Ѡ$.w'�]F��J%6��#����Ie*qs+u�.U1+�tbZ���e#�
5L-aZ4�Y�:f��U ��C*�Q�c��G�i;��T�`�5�,�0]:3Yd��"z��Q�փ�d��T��)<�O:*n�5 �Ѐ$q��#���;��mPJ"E�CE��pT�[�H�#a�h�${J|��sy��~�� a�h�/��e,����=2��Bww��B�D{�9C��II��:ץ��턺���0w���#�`����u���%u9��h� ��2�\�c�m�>���Cz�����vuuSO��d1����x��V�d��؎����7=���h�φ�x[��<��}�ߔq��-ָ�O��e!2�b���Z&�lˈc|웴+u����q�M�	�L��*c�=��� z���qf�Oc�犏�!�yq��H���/�9�,��m�6�p�u�qn��	�d<��@ ��f9�8�Cz' ��JD�2
�2����{c�;��U?ExW@9�b��'i}Q$T��n_���B�����g�R��^)?��ب���I
�W�|�LQ���HM>MsGS����|gЮ�aա��Q�ĺ�����F�[��2�����Aik[��_���l��vH¶���08�@���/	"���;,����T�������8O5�K�HD2D�aq�)[�"���Q5yP�������ؖ��]�ٮO�F)�8�]�ZYb��s����OO��阸KR?�J^~�)L�����|Ǚ����N2��qj�v�����k�s����&�^7�حu��s��!N���v�����E�V�ڛ��w�$Gz��_$��)6&Fi�i!�wAmx?2 ���Fz��e���}��D:χ�1�|��׹<o_�7e\���H7�29f�_�P���e-�/�}ـt�_މҤi6dޱ?��ˀ��'�1�st͛{�7Cʕ����7�s�q_H�@ �@ �s�i�|�G�рT��c@B�DeP�I�4�H�B��"��$���-�I=�z"��- }���)KRE��kC(K^|�W*R
�P����r�K"�_���͏���a���v�^�Ț��]����S
%i�(�4�1�����a��_���T�2T��;�y�0����P;wbp����VA}�����JUG��J�p� ���
Uj��Cc���>�F�z�
T���.)ϗEI�� QG�&�i�0%��Y�+��S����e���Fk@rz���q>���~%��(�����̸��������N�Ǻ��ǌ�k��q(��1d��7 ����5�(l�Sug�EZ������C_����H��˛�4nb�`�i�}��oR��I��ur�k�u���`@J2���%=�Y��c�H#Gr����K]�^_�a�&���Ytݏ�;�(2��?���l(����H?>��ݠ��y�M�Au�Qi"f/���	�@ �@`O����Є�U����QRY�
����b��U���V�JFD}lD���iL�X)BJ��F$�(I/�g⩒N#QQD�Q�� yi`*��JD�r��֨�MD�/�IJu��%�:�1[w(YcR�nv7���b	%�B14��(��%ioP�Ґ��l�^���C��_�ƭ�xa��k�[����*�����P��1�c �;w�1\�i����~���GUԪ�K�ڠ1�I��� �e@2:4�����y��3 �k�$w*�����>�+���q�t>N���>�r��~g8R�זz5��Sܴ�d<H�7�΀Ĳ�~y�f�+�z|Z�攍��y/$iw��^7 �X�Ik��6tu��O���|��ȣي]�A[��҆*��3��Ec�-6�.k�ț��^�n�qt4 9_�����p�n��}C@۲eGR����7���g]�p���k���\�_]c jV��ҮD�6L��n@z��~��9IҮ�O�'��t���H�@ �@ �����xd�|4��?Q��:��S)���"��P���
��՘D�Ԁd��u�/�R�PW�Q_����zJ�J��������+�8D�Q��])�o�L=�����Ej|*���%n��n��u�^kH_hT�A�_�N�;���Iw6���C�e�H���W��v;E��	�j�V�}a;�60(��c��0v��Z��Uz�'s5�s ۷�R��ѹե��Qځ�~ԇ����DC�}4��Cc;B���2�(M�aνtR��X<OGg�lR��A�~ϸ��ktu�6�i}��6��Z��yu�����c4��>���/%.�����OE;�$� e͘��Y��O�zO������:\�+��5�ܡeU$�"�K� �h`�K9�_Z��wI�x�}"��{��萔Ip��섟�M��snzb�x{�cR��x�Q\ަ�mf�o��[&�Ǒ&� vBch1�"<�SoW�X�q�Z�oZ��֑A^���%�0s��FY�'�4�Ƶ��[�yu�-oǙ.���g�&���?8�6�5�^�vs4R򶐚6����[˽5�c��uI�`5�0�lG�t5E~���C�ͽ�����1 ��k&m��cLH�v�?�`��;pY��l�,Z�w_1߆v'l���n�Os�]��g�܉Y3���g�ncZ	�@ �@ �X9����Gz�AT��Ž��rQ�u�>*��Т��
F�5T�V/�ӥQ�Xh�5����R;Ud~�zJEL���h�[)9cC�xT��ƧZU\���#�P��,��J��rA���c��'��$�{�_�ʩ.��F�*)B���Xڡ>���L��h>i��|�Y�%}���n܂�B���~���ҏ��t�\����6c`W��'�X��F+Tw"�߄������.�T<T��a��&��9�����Q���K���QSC��l�8YV@]㨛��,�=�zj���yI��z\}t�AK��]�տ��L�k@���'2^����7�`;:6�f�u����^���n���?�@·F��k��vU~p��]�	�z7����:�a��Y���ɜ_/.�����v��r�x��gLV��m�v��ߴ���7���bs�p!ˣI���G��h�����9�!kNGR>��:��~Cf_�n_'�6�-F7�ˀ���u4����2�k��ର羸ߓݳKW���
��d���i����6�<��	|����@ �@ M����#4��C]�&�7�E�ZQ�nQ��*���)T��zj�U)_o0�(��^�	o��k�s�ul�c�P�)����H5/H;[�
v�l�:��J�zя
��M�o��ۆj�!�wI��70��� ߋ$=��Ә4��\��;�R�0�ar�(��Jxj�Y�cn/p�`�T��I3�W΍p�Q��&�/��������g�o=�X�w��8q^'֋CfH=��܃zwn�<I8�93�����*Ιf��F���u�qz�(�J�>�E����S��أ��q|0�˟v��O��e��Q��X�g<��%t�����C|