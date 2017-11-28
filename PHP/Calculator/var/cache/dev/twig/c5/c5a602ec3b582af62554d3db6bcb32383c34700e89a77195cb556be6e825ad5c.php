<?php

/* @WebProfiler/Collector/router.html.twig */
class __TwigTemplate_1f7bf5c61432ca1d2a4ae2d9b4138c34a707634aa470868923e461b562b1c955 extends Twig_Template
{
    public function __construct(Twig_Environment $env)
    {
        parent::__construct($env);

        // line 1
        $this->parent = $this->loadTemplate("@WebProfiler/Profiler/layout.html.twig", "@WebProfiler/Collector/router.html.twig", 1);
        $this->blocks = array(
            'toolbar' => array($this, 'block_toolbar'),
            'menu' => array($this, 'block_menu'),
            'panel' => array($this, 'block_panel'),
        );
    }

    protected function doGetParent(array $context)
    {
        return "@WebProfiler/Profiler/layout.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = array())
    {
        $__internal_0e8caa1dba12bb4b31a46470ed6d53147f1342c519046db6e6946f88cf58b688 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_0e8caa1dba12bb4b31a46470ed6d53147f1342c519046db6e6946f88cf58b688->enter($__internal_0e8caa1dba12bb4b31a46470ed6d53147f1342c519046db6e6946f88cf58b688_prof = new Twig_Profiler_Profile($this->getTemplateName(), "template", "@WebProfiler/Collector/router.html.twig"));

        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_0e8caa1dba12bb4b31a46470ed6d53147f1342c519046db6e6946f88cf58b688->leave($__internal_0e8caa1dba12bb4b31a46470ed6d53147f1342c519046db6e6946f88cf58b688_prof);

    }

    // line 3
    public function block_toolbar($context, array $blocks = array())
    {
        $__internal_eb2f30d3451879372da647de2609a980ef79b12e63053aa8b3b162218e0ecc56 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_eb2f30d3451879372da647de2609a980ef79b12e63053aa8b3b162218e0ecc56->enter($__internal_eb2f30d3451879372da647de2609a980ef79b12e63053aa8b3b162218e0ecc56_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "toolbar"));

        
        $__internal_eb2f30d3451879372da647de2609a980ef79b12e63053aa8b3b162218e0ecc56->leave($__internal_eb2f30d3451879372da647de2609a980ef79b12e63053aa8b3b162218e0ecc56_prof);

    }

    // line 5
    public function block_menu($context, array $blocks = array())
    {
        $__internal_3e0d013aad4441df6e57342edc6ab371b0b0fa8f982c0b0f07bd44d247bec0f3 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_3e0d013aad4441df6e57342edc6ab371b0b0fa8f982c0b0f07bd44d247bec0f3->enter($__internal_3e0d013aad4441df6e57342edc6ab371b0b0fa8f982c0b0f07bd44d247bec0f3_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "menu"));

        // line 6
        echo "<span class=\"label\">
    <span class=\"icon\">";
        // line 7
        echo twig_include($this->env, $context, "@WebProfiler/Icon/router.svg");
        echo "</span>
    <strong>Routing</strong>
</span>
";
        
        $__internal_3e0d013aad4441df6e57342edc6ab371b0b0fa8f982c0b0f07bd44d247bec0f3->leave($__internal_3e0d013aad4441df6e57342edc6ab371b0b0fa8f982c0b0f07bd44d247bec0f3_prof);

    }

    // line 12
    public function block_panel($context, array $blocks = array())
    {
        $__internal_ce2a62fa49f366f75be0d432af7352da4326cedbc5a8d62365f7726d7f974833 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_ce2a62fa49f366f75be0d432af7352da4326cedbc5a8d62365f7726d7f974833->enter($__internal_ce2a62fa49f366f75be0d432af7352da4326cedbc5a8d62365f7726d7f974833_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "panel"));

        // line 13
        echo "    ";
        echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\HttpKernelExtension')->renderFragment($this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("_profiler_router", array("token" => (isset($context["token"]) ? $context["token"] : $this->getContext($context, "token")))));
        echo "
";
        
        $__internal_ce2a62fa49f366f75be0d432af7352da4326cedbc5a8d62365f7726d7f974833->leave($__internal_ce2a62fa49f366f75be0d432af7352da4326cedbc5a8d62365f7726d7f974833_prof);

    }

    public function getTemplateName()
    {
        return "@WebProfiler/Collector/router.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  73 => 13,  67 => 12,  56 => 7,  53 => 6,  47 => 5,  36 => 3,  11 => 1,);
    }

    public function getSource()
    {
        return "{% extends '@WebProfiler/Profiler/layout.html.twig' %}

{% block toolbar %}{% endblock %}

{% block menu %}
<span class=\"label\">
    <span class=\"icon\">{{ include('@WebProfiler/Icon/router.svg') }}</span>
    <strong>Routing</strong>
</span>
{% endblock %}

{% block panel %}
    {{ render(path('_profiler_router', { token: token })) }}
{% endblock %}
";
    }
}
