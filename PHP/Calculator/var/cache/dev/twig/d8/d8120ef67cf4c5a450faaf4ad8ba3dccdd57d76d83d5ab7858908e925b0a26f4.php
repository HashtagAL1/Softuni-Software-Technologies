<?php

/* @Twig/Exception/exception_full.html.twig */
class __TwigTemplate_df3e123fa1bd6cfbf098056f43ce5ed193803870d654b090144db0025b71cfcc extends Twig_Template
{
    public function __construct(Twig_Environment $env)
    {
        parent::__construct($env);

        // line 1
        $this->parent = $this->loadTemplate("@Twig/layout.html.twig", "@Twig/Exception/exception_full.html.twig", 1);
        $this->blocks = array(
            'head' => array($this, 'block_head'),
            'title' => array($this, 'block_title'),
            'body' => array($this, 'block_body'),
        );
    }

    protected function doGetParent(array $context)
    {
        return "@Twig/layout.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = array())
    {
        $__internal_ca5992fc65f50207ed26b2cd3570ac5e46e20b2e001fe263e0687c368ca2446c = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_ca5992fc65f50207ed26b2cd3570ac5e46e20b2e001fe263e0687c368ca2446c->enter($__internal_ca5992fc65f50207ed26b2cd3570ac5e46e20b2e001fe263e0687c368ca2446c_prof = new Twig_Profiler_Profile($this->getTemplateName(), "template", "@Twig/Exception/exception_full.html.twig"));

        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_ca5992fc65f50207ed26b2cd3570ac5e46e20b2e001fe263e0687c368ca2446c->leave($__internal_ca5992fc65f50207ed26b2cd3570ac5e46e20b2e001fe263e0687c368ca2446c_prof);

    }

    // line 3
    public function block_head($context, array $blocks = array())
    {
        $__internal_210c6e2a61aa9063a5486e26af0a7b9cbd0a2b4c15f30eeeb4d939c83b5286bd = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_210c6e2a61aa9063a5486e26af0a7b9cbd0a2b4c15f30eeeb4d939c83b5286bd->enter($__internal_210c6e2a61aa9063a5486e26af0a7b9cbd0a2b4c15f30eeeb4d939c83b5286bd_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "head"));

        // line 4
        echo "    <link href=\"";
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\HttpFoundationExtension')->generateAbsoluteUrl($this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("bundles/framework/css/exception.css")), "html", null, true);
        echo "\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />
";
        
        $__internal_210c6e2a61aa9063a5486e26af0a7b9cbd0a2b4c15f30eeeb4d939c83b5286bd->leave($__internal_210c6e2a61aa9063a5486e26af0a7b9cbd0a2b4c15f30eeeb4d939c83b5286bd_prof);

    }

    // line 7
    public function block_title($context, array $blocks = array())
    {
        $__internal_6cee421616e8fab94238f4bf082d3e8a69545c67421c3c9a7c892991792f3157 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_6cee421616e8fab94238f4bf082d3e8a69545c67421c3c9a7c892991792f3157->enter($__internal_6cee421616e8fab94238f4bf082d3e8a69545c67421c3c9a7c892991792f3157_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "title"));

        // line 8
        echo "    ";
        echo twig_escape_filter($this->env, $this->getAttribute((isset($context["exception"]) ? $context["exception"] : $this->getContext($context, "exception")), "message", array()), "html", null, true);
        echo " (";
        echo twig_escape_filter($this->env, (isset($context["status_code"]) ? $context["status_code"] : $this->getContext($context, "status_code")), "html", null, true);
        echo " ";
        echo twig_escape_filter($this->env, (isset($context["status_text"]) ? $context["status_text"] : $this->getContext($context, "status_text")), "html", null, true);
        echo ")
";
        
        $__internal_6cee421616e8fab94238f4bf082d3e8a69545c67421c3c9a7c892991792f3157->leave($__internal_6cee421616e8fab94238f4bf082d3e8a69545c67421c3c9a7c892991792f3157_prof);

    }

    // line 11
    public function block_body($context, array $blocks = array())
    {
        $__internal_c8d04c20d199fbcf98baaa42f3ce916384ef88fb2cdaca38d252257986fb7073 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_c8d04c20d199fbcf98baaa42f3ce916384ef88fb2cdaca38d252257986fb7073->enter($__internal_c8d04c20d199fbcf98baaa42f3ce916384ef88fb2cdaca38d252257986fb7073_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "body"));

        // line 12
        echo "    ";
        $this->loadTemplate("@Twig/Exception/exception.html.twig", "@Twig/Exception/exception_full.html.twig", 12)->display($context);
        
        $__internal_c8d04c20d199fbcf98baaa42f3ce916384ef88fb2cdaca38d252257986fb7073->leave($__internal_c8d04c20d199fbcf98baaa42f3ce916384ef88fb2cdaca38d252257986fb7073_prof);

    }

    public function getTemplateName()
    {
        return "@Twig/Exception/exception_full.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  78 => 12,  72 => 11,  58 => 8,  52 => 7,  42 => 4,  36 => 3,  11 => 1,);
    }

    public function getSource()
    {
        return "{% extends '@Twig/layout.html.twig' %}

{% block head %}
    <link href=\"{{ absolute_url(asset('bundles/framework/css/exception.css')) }}\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />
{% endblock %}

{% block title %}
    {{ exception.message }} ({{ status_code }} {{ status_text }})
{% endblock %}

{% block body %}
    {% include '@Twig/Exception/exception.html.twig' %}
{% endblock %}
";
    }
}
