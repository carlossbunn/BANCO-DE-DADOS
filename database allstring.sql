PGDMP         -                z         	   CasaDShow    15.0    15.0 
    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                        0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    24673 	   CasaDShow    DATABASE     �   CREATE DATABASE "CasaDShow" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE "CasaDShow";
                postgres    false            �            1259    24722    apresentacoes    TABLE     �   CREATE TABLE public.apresentacoes (
    "idShow" integer NOT NULL,
    nome character varying,
    "datadShow" character varying,
    hora character varying
);
 !   DROP TABLE public.apresentacoes;
       public         heap    postgres    false            �            1259    24697    artistas    TABLE     }   CREATE TABLE public.artistas (
    idartista integer NOT NULL,
    nome character varying(20) NOT NULL,
    idade integer
);
    DROP TABLE public.artistas;
       public         heap    postgres    false            �          0    24722    apresentacoes 
   TABLE DATA           J   COPY public.apresentacoes ("idShow", nome, "datadShow", hora) FROM stdin;
    public          postgres    false    215   �	       �          0    24697    artistas 
   TABLE DATA           :   COPY public.artistas (idartista, nome, idade) FROM stdin;
    public          postgres    false    214   
       k           2606    24728     apresentacoes apresentacoes_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.apresentacoes
    ADD CONSTRAINT apresentacoes_pkey PRIMARY KEY ("idShow");
 J   ALTER TABLE ONLY public.apresentacoes DROP CONSTRAINT apresentacoes_pkey;
       public            postgres    false    215            i           2606    24701    artistas artistas_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.artistas
    ADD CONSTRAINT artistas_pkey PRIMARY KEY (idartista);
 @   ALTER TABLE ONLY public.artistas DROP CONSTRAINT artistas_pkey;
       public            postgres    false    214            �      x������ � �      �   i   x�%�A
�PDד�I�o n��&J��Z����0�9��2���M1�p�x�ȵ�7��\�o�L����<���{��Uԍ�����	�γ4�r����     